# Taller1-AREP
# APLICACIONES DISTRIBUIDAS (HTTP, SOCKETS, HTML, JS,MAVEN, GIT)

Debe construir una aplicación para consultar la información de películas de cine.  La aplicación recibirá una frase de búsqueda del título, por ejemplo “Guardians of the galaxy”  y deberá mostrar el los datos de la película correspondiente. Para esto utilice el API gratuito de https://www.omdbapi.com/ (Puede crear obtener una llave gratuita para realizar consultas). Se le pide que su implementación sea eficiente en cuanto a recursos así que debe implementar un Caché que permita evitar hacer consultas repetidas al API externo.  

Autor: Cristian Fernando Rodríguez González  

## EJECUCION 
1. Clonar el repositorio usando el código a continuación:  
    `git clone https://github.com/CrisRod8/Taller1-AREP.git`

2. Dentro de la carpeta creada abrimos el cmd y ejecutamos el siguiente comando:  
   `mvn clean package exec:java -D "exec.mainClass"="edu.escuelaing.arep.HttpServer"`
   
   Debemos recibir la siguiente respuesta:
   ![image](https://github.com/CrisRod8/Taller1-AREP/assets/111186898/8bd02bad-1db5-4d4b-b4d0-b3a687fbef05)
  
4. Desde algun browser, como Firefox, escribimos la direccion: http://localhost:35000 
   ![image](https://github.com/CrisRod8/Taller1-AREP/assets/111186898/2d922ee6-bf12-4d76-93f6-f2f43eb2f2b1)

5. Al buscar una película, en este caso Batman, obtenemos la siguiente información:
   ![image](https://github.com/CrisRod8/Taller1-AREP/assets/111186898/fdea6fe8-bdf2-4bb4-a9aa-592cdd100c58)


6. Para visualizar el javadoc ejecutamos el siguiente comando  
    `mvn javadoc:javadoc`  y despues vamos a la carpeta target/site/apidocs acá encontraremos todos los documentos creados:   
    ![image](https://github.com/CrisRod8/Taller1-AREP/assets/111186898/d1792a2a-fa89-4df6-a089-68eafe7debc9)


## TEST  
Para correr los test ejecutamos el comando `mvn test` en el cmd que hemos estado utilizando:
    ![image](https://github.com/CrisRod8/Taller1-AREP/assets/111186898/baae0f16-0710-40e8-8612-f0cc9899456c)



# Descripcion  
Se realizó una arquitectura enfocada en API Rest en la que implementó el patrón de diseño SINGLETON para la creación de caché porque este debe ser el único caché que debe existir dentro del servidor.

Patrones usados: Se usaron tanto el patrón de Fachada como el patrón Singleton.  

Extensibilidad: Si se necesita hacer una consulta a otra API del mismo estilo basta con cambiar la dirección de la URL en el atributo establecido en la clase de APIConnection y mandar el Query correspondiente en la clase HttpServer.  

Modularización: Todas clases implementan sus respectivos métodos en base al principio de única responsabilidad, para poder extender el código si este lo necesita.
