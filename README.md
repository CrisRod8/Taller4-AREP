# Taller2-AREP

# MICROFRAMEWORKS WEB

En este taller usted debe explorar la arquitectura del microframework WEB denominado sparkweb (https://sparkjava.com/). Este micro framework permite construir aplicaciones web de manera simple usando funciones lambda.

Para este ejercicio usted deb construir un  servidor web para soportar una funcionalidad similar a la de Spark. Su aplicación debe permitir por lo menos el registro de servicios get y post usando funciones lambda.  
Implemente igualmente funciones que le permitan configurar el directorio de los archivos estáticos, y otra que permita cambiar el tipo de la respuesta a "application/json". Para esto solo debe usar el API básico de Java. No utilice frameworks como Spark o Spring.  

Autor: Cristian Fernando Rodríguez González  

## EJECUCIÓN 
1. Clonar el repositorio usando el código a continuación:
   ```
   git clone https://github.com/CrisRod8/Taller3-AREP.git
   ```
2. Dentro de la carpeta creada abrimos el cmd y ejecutamos el siguiente comando:
   ```
   mvn clean package exec:java -D "exec.mainClass"="edu.escuelaing.arep.Main"
   ```

   Debemos recibir la siguiente respuesta:
  ![image](https://github.com/CrisRod8/Taller3-AREP/assets/111186898/482137ed-1c05-4e40-9310-77b3e6658743)  
  
3. Desde algun browser, como Firefox, empezamos a probar las siguientes direcciones:
   ```
   http://localhost:35000/apps/index.html
   ``` 
  ![image](https://github.com/CrisRod8/Taller2-AREP/assets/111186898/6287bc3f-a68b-4a13-b11f-4ce846b5dcfe)  

   ```
   http://localhost:35000/apps/index.css
   ```
  ![image](https://github.com/CrisRod8/Taller2-AREP/assets/111186898/4b8ef3c7-2c4f-4b33-aa94-825a12e9f058)  

   ```
   http://localhost:35000/apps/color.js
   ```
  ![image](https://github.com/CrisRod8/Taller2-AREP/assets/111186898/e2bc3cb3-c446-4651-97a2-5b679ab97c46)  

  Si intentamos buscar una página que no existe con un servicio no implementado tendremos la siguiente respuesta:  
   ```
   http://localhost:35000/apps/asdfg.html
   ```
  ![image](https://github.com/CrisRod8/Taller2-AREP/assets/111186898/01336341-f523-4136-803a-f72d49775d34)  

4. Usamos el siguiente comando para probar los métodos HTTP GET y POST:

    ```
    curl http://localhost:35000/index.html
    ```
  ![image](https://github.com/CrisRod8/Taller3-AREP/assets/111186898/ef391592-7b00-435a-89a8-d728ec7d4cef)  
  ![image](https://github.com/CrisRod8/Taller3-AREP/assets/111186898/3ff1059b-f46c-472a-9bf1-e03a02f0fe14)  
    
5. Para visualizar el javadoc ejecutamos el siguiente comando:
   ```
   mvn javadoc:javadoc
   ```
   y despues vamos a la carpeta target/site/apidocs acá encontraremos todos los documentos creados:

  ![image](https://github.com/CrisRod8/Taller3-AREP/assets/111186898/6d718f44-4688-4d21-80ac-01f849f1f629)  
  
# DESCRIPCIÓN  
Con la implementación de Microframeworks Web, en este caso Spark, diseñamos un software ligero y minimalista que facilita el desarrollo del servicio web sin la necesidad de agregar funcionalidades o componentes complejos para seguir con la linea de la arquitectura enfocada en API Rest, usando patrones como el patrón de diseño SINGLETON para la implementación de servicios.

Patrones usados: Se usaron tanto el patrón de Fachada como el patrón Singleton.  

Extensibilidad: Como se tiene solo una clase para instanciar los servicios se repeta el patrón SINGLENTON y solo necesitamos especificar el path y la extensión para obtener los recursos correspondientes.  

Modularización: Todas clases implementan sus respectivos métodos en base al principio de única responsabilidad, para poder extender el código si este lo necesita.
 
