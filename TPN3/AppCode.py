import os

# importo la libreria de flask que me ayuda a crear apis de forma rapida
from flask import Flask
# importo la libreria de redis que me ayuda a crear una conexion con redis
from redis import Redis


app = Flask(__name__)  # creo una instancia de la libreria flask
# se conecta con redis y especifica el host y puerto, que se encontraron en el contenedor cuando se creo.
redis = Redis(host=os.environ['REDIS_HOST'], port=os.environ['REDIS_PORT'])
# Especifica el puerto donde estara escuchando el servidor, el bind_port es el que esta en el contenedor que se creo.
bind_port = int(os.environ['BIND_PORT'])


# creo una ruta para la raiz de la api, como si fuera el route de .NET, para el controlador
@app.route('/')
def hello():  # creo una funcionque imparcta en la ruta raiz
    # incremento el valor de la variable hits en redis, osea cuando se carga o le pego a la url +=1 en hits
    redis.incr('hits')
    # obtengo el valor de la variable hits en redis y lo decodifico para que sea un string
    total_hits = redis.get('hits').decode()
    # retorno un mensaje con el valor de la variable hits
    return f'Hello from Redis! I have been seen {total_hits} times.'


if __name__ == "__main__":  # si el archivo es el principal
    # corro la aplicacion en el puerto indicado en el archivo de entorno o servidor localhost:5000
    app.run(host="0.0.0.0", debug=True, port=bind_port)
    # host: es el nombre del host o ip del servidor para escuchar, que por default es localhost
    # debug: es un parametro que permite ver errores en la aplicacion
    # port: puerto donde corre la aplicacion, que por defecto es el 5000



