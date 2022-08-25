from flask import Flask, render_template, request, make_response, g
#Flask es una libreria que en si manipula las request de la api,
#g:almacena los datos en el contexto de la aplicacion durante la request, esto se elimina al cerrar la request
#make_response: permite crear una respuesta para la request y permite a los usuarios agregar headers adicionales en la response
#render_template: permite renderizar una plantilla html

from redis import Redis #redis es una base de datos en memoria
import os
import socket
import random
import json
import logging

option_a = os.getenv('OPTION_A', "Cats")
option_b = os.getenv('OPTION_B', "Dogs")
hostname = socket.gethostname()

app = Flask(__name__)

gunicorn_error_logger = logging.getLogger('gunicorn.error')
app.logger.handlers.extend(gunicorn_error_logger.handlers)
app.logger.setLevel(logging.INFO)


#Defino una funcion redis, en la cual si no existe un atributo redis en el objeto g, devuelve !true
def get_redis():
    if not hasattr(g, 'redis'):# en g se guarda un post que dura lo que dura la request
        g.redis = Redis(host="redis", db=0, socket_timeout=5) #sta es una instancia de redis donde le paso los parametros, el socket_timeout 
        #es para que no se quede esperando por un tiempo largo.
    return g.redis


#al realzar un post, los resultados se almacenan en un body de la request
#que es un json, que tienen dos atributos el voter_id y el vote, el voter_id es el id del usuario que vota, el vote es el valor del voto

@app.route("/", methods=['POST','GET']) #route http, con sus metodos
def hello():
    voter_id = request.cookies.get('voter_id') #obtengo el valor de la cookie voter_id
    if not voter_id: #si no existe el atributo voter_id
        voter_id = hex(random.getrandbits(64))[2:-1] #genero un id aleatorio, el hex es para que sea un hexadecimal, el getrandbits es para que sea un numero aleatorio,
        #64 es el numero de bits,el [2:-1] es para que no se muestre el 0x

    vote = None #creo una variable vote que sera el valor del voto

    if request.method == 'POST': #si el metodo es post
        redis = get_redis() #obtengo la instancia de redis
        vote = request.form['vote'] #obtengo el valor del voto
        app.logger.info('Received vote for %s', vote)#loggeo el valor del voto
        data = json.dumps({'voter_id': voter_id, 'vote': vote}) #creo un json con los datos del voto, un objeto lo creo en json
        redis.rpush('votes', data) #agrego el json a la lista de votos, con el metodo rpush, que es una lista de redis, el data es el json, 
        #el votes es el nombre de la lista

    resp = make_response(render_template( #creo una respuesta para la request
        'index.html',                    #renderizo la plantilla html
        option_a=option_a,               #le paso los valores de las opciones a la plantilla html
        option_b=option_b,               #le paso los valores de las opciones a la plantilla html x2
        hostname=hostname,               #le paso el nombre del host a la plantilla html
        vote=vote,                       #le paso el valor del voto a la plantilla html, si no existe el voto, el valor sera None
    ))
    resp.set_cookie('voter_id', voter_id) #seteo la cookie voter_id con el valor del id del usuario
    return resp                           #devuelvo la respuesta
 

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=80, debug=True, threaded=True)