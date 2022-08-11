#Trabajo Práctico 1 - Git Básico 
1- Objetivos de Aprendizaje
• Utilizar herramientas de control de configuración de software
• Familiarizarse con los comandos más utilizados
• Configurar el repositorio principal de cada alumno para la materia

2- Unidad temática que incluye este trabajo práctico
Este trabajo práctico corresponde a la unidad Nº: 1

3- Consignas a desarrollar en el trabajo práctico:
• Los ejercicios representan casos concretos y rutinarios en uso de este tipo de herramientas

• En los puntos donde corresponda, proveer los comandos de git necesarios
para llevar a cabo el punto.

• Cuando se especifique alguna descripción, realizarlo de la manera más clara posible y con ejemplos cuando sea necesario.

4- Desarrollo:

#1- Instalar Git ✔️
Los pasos y referencias asumen el uso del sistema operativo Windows, en caso
otros SO seguir recomendaciones específicas.

• Bajar e instalar el cliente git. Por ejemplo, desde https://git-scm.com/

• Bajar e instalar un cliente visual. Por ejemplo, TortoiseGit para Windows 

o SourceTree para Windows/MAC:

o https://tortoisegit.org/

o https://www.sourcetreeapp.com/

o Lista completa: https://git-scm.com/downloads/guis/

#2- Crear un repositorio local y agregar archivos✔️

• Crear un repositorio local en un nuevo directorio.\00

• Agregar un archivo Readme.md, agregar algunas líneas con texto a dicho
archivo.

• Crear un commit y proveer un mensaje descriptivo.

#3- Crear un repositorio remoto✔️

• Crear una cuenta en https://github.com

• Crear un nuevo repositorio en dicha página (vacío)

• Asociar el repositorio local creado en el punto 2 al creado en github.

• Subir los cambios locales a github.

#4- Familiarizarse con el concepto de Pull Request Para algunos de los puntos proveer imágenes.

#Explicar que es una pull request.✔️

Una pull request es una solicitud que se hace para pedir la incorporacion de cambios al repo original desde una branch, lo que se realizo fue crear una nueva rama, como se ven en las imagenes, me paro en ella, esta suele ser la rama dev o de pruebas, luego pushear a ella que esta vinculada a la master o main, se hace una pull request, donde se revisa y se hacen comentarios y si todo esta correcto se incorpora el cambio a la rama master.
![](/Imagenes%20ejercicios/1.jpeg)
![](/Imagenes%20ejercicios/2.jpeg)
![](/Imagenes%20ejercicios/3.jpeg)
![](/Imagenes%20ejercicios/4.jpeg)
![](/Imagenes%20ejercicios/5.jpeg)

• Crear un branch local y agregar cambios a dicho branch.

• Subir el cambio a dicho branch y crear un pull request.

• Completar el proceso de revisión en github y mergear el PR al branch
master.

#5- Mergear código con conflictos
• Instalar alguna herramienta de comparación. Idealmente una 3 Way:
o P4Merge https://www.perforce.com/downloads/helix-visual-clientp4v:
o Se puede omitir registración. Instalar solo opción Merge and DiffTool.

• ByondCompare trial
version https://www.scootersoftware.com/download.php

o Configurar Tortoise/SourceTree para soportar esta herramienta.

    § https://www.scootersoftware.com/support.php?zz=kb_vcs
    § https://medium.com/@robinvanderknaap/using-p4mergewith-tortoisegit-87c1714eb5e2

o Clonar en un segundo directorio el repositorio creado en github.

o En el clon inicial, modificar el Readme.md agregando más texto.

o Hacer commit y subir el cambio a master a github.

o En el segundo clon
también agregar texto, en las mismas líneas que
se modificaron el punto anterior.

o Intentar subir el cambio, haciendo un commit y push. Mostrar el error
que se obtiene.
o Hacer pull y mergear el código (solo texto por ahora), mostrar la
herramienta de mergeo como luce.

o Resolver los conflictos del código.

o Explicar las versiones LOCAL, BASE y REMOTE.

o Pushear el cambio mergeado.

#Mi paso a paso

- Clono mi repo en una segunda carpeta
  ![](/Imagenes%20ejercicios/5.1.jpeg)
- En el clon inicial, realice una modificacion en el readme, hice un commit y push
- Luego en el segundo directorio intente hacer push de lo que tenia y me salto el siguiente error
  ![](/Imagenes%20ejercicios/5.2.jpeg)
- Luego intente realizar un pull, para ver cual era la inconsistencia entre las dos versiones
  ![](/Imagenes%20ejercicios/5.3.jpeg)
- cuando hice el pull me genero ese conflicto del merge que estabamos buscando por lo que en el editor de codigo ya me marcaba en rojo como es que lo tenia antes y en verde el cambio realizado de forma local, por lo que lo volvi a cambiar para que me deje realizar el push, desde el segundo directorio.
  ![](/Imagenes%20ejercicios/5.4.jpeg)
- Aca se puede observar que ya los cambios quedaron consistentes y se puede realizar el commit y push o realizar nuevas modificaciones, esto genera que en un equipo de desarrollo todos partan de la misma base o version que se hizo commit y no hayan conflictos de merge.
  ![](/Imagenes%20ejercicios/5.5.jpeg)
- Como ya se corrigio el cambio si quiero hacer un push, esto es lo que me devuelve por consola que es lo que me tiene que devolver.
  ![](/Imagenes%20ejercicios/5.6.jpeg)

6- Algunos ejercicios online
• Entrar a la página https://learngitbranching.js.org/
• Completar los ejercicios Introduction Sequence
• Opcional - Completar el resto de los ejercicios para ser un experto en Git!!!

- Se realizaron los ejercicios introductorios de la pagina propuesta, es una buena herramienta interactiva que ayuda a acoplar lo que se plantea en el practico y mas.

![](/Imagenes%20ejercicios/5.7.jpeg)

- Aqui concluye el primer practico de la materia Ingenieria de Software III ✔️

7- Crear Repositorio de la materia
• Crear un repositorio para la materia en github. Por ejemplo ing-software-3
• Subir archivo(s) .md con los resultados e imágenes de este trabajo práctico.
Puede ser en una subcarpeta trabajo-practico-01
Referencias