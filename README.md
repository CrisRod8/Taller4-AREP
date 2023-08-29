# Taller2-AREP

# DISEÑO Y ESTRUCTURACIÓN DE APLICACIONES DISTRIBUIDAS EN INTERNET

Escriba un servidor web que soporte múlltiples solicitudes seguidas (no concurrentes). El servidor debe leer los archivos del disco local y retornar todos los archivos solicitados, incluyendo páginas html, archivos java script, css e imágenes. Construya una aplicación web con  javascript, css, e imágenes para probar su servidor. Incluya en la aplicación la comunicación asíncrona con unos servicios REST en el backend. NO use frameworks web como Spark o Spring, use solo Java y las librerías para manejo de la red.

Autor: Cristian Fernando Rodríguez González  

## EJECUCIÓN 
1. Clonar el repositorio usando el código a continuación:
   ```
   git clone https://github.com/CrisRod8/Taller2-AREP.git
   ```
2. Dentro de la carpeta creada abrimos el cmd y ejecutamos el siguiente comando:
   ```
   mvn clean package exec:java -D "exec.mainClass"="edu.escuelaing.arep.HttpServer"
   ```

   Debemos recibir la siguiente respuesta:
  ![image](https://github.com/CrisRod8/Taller2-AREP/assets/111186898/a5e5a7db-3916-4eb6-83cf-9785f3e5778d)
  
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
  
4. Para visualizar el javadoc ejecutamos el siguiente comando:
   ```
   mvn javadoc:javadoc
   ```
   y despues vamos a la carpeta target/site/apidocs acá encontraremos todos los documentos creados:

   ![image](https://github.com/CrisRod8/Taller2-AREP/assets/111186898/2bf2a7bf-a751-4df3-884e-e2831a5995fb)   


# DESCRIPCIÓN  
Seguimos trabajando la arquitectura enfocada en API Rest, usando patrones como el patrón de diseño SINGLETON para la implementación de servicios.

Patrones usados: Se usaron tanto el patrón de Fachada como el patrón Singleton.  

Extensibilidad: Como se tiene solo una clase para instanciar los servicios se repeta el patrón SINGLENTON y solo necesitamos especificar el path y la extensión para obtener los recursos correspondientes.  

Modularización: Todas clases implementan sus respectivos métodos en base al principio de única responsabilidad, para poder extender el código si este lo necesita.
