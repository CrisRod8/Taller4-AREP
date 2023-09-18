# Taller4-AREP

# TALLER DE ARQUITECTURAS DE SERVIDORES DE APLICACIONES, META PROTOCOLOS DE OBJETOS, PATRÓN IOC, REFLEXIÓN

Para este taller los estudiantes deberán construir un servidor Web (tipo Apache) en Java. El servidor debe ser capaz de entregar páginas html e imágenes tipo PNG. Igualmente el servidor debe proveer un framework IoC para la construcción de aplicaciones web a partir de POJOS. Usando el servidor se debe construir una aplicación Web de ejemplo. El servidor debe atender múltiples solicitudes no concurrentes.

Para este taller desarrolle un prototipo mínimo que demuestre capcidades reflexivas de JAVA y permita por lo menos cargar un bean (POJO) y derivar una aplicación Web a partir de él. 

Autor: Cristian Fernando Rodríguez González  

## EJECUCIÓN 
1. Clonar el repositorio usando el código a continuación:
   ```
   git clone https://github.com/CrisRod8/Taller4-AREP.git
   ```
2. Dentro de la carpeta creada abrimos el cmd y ejecutamos el siguiente comando:
   ```
   java -cp target/classes edu.escuelaing.arep.Main
   ```

   Debemos recibir la siguiente respuesta:
  ![image](https://github.com/CrisRod8/Taller4-AREP/assets/111186898/ac5837b1-1492-4c0d-aa3b-644e81e6f5a4)
  
3. Desde algun browser, como Firefox, empezamos a probar las siguientes direcciones:
   ```
   http://localhost:35000/
   ``` 
  ![image](https://github.com/CrisRod8/Taller4-AREP/assets/111186898/3be61233-e106-4631-9b18-7c89ebf14cb9)  

  
   ```
   http://localhost:35000/ok
   ```
  ![image](https://github.com/CrisRod8/Taller4-AREP/assets/111186898/4d95005f-9d23-4f27-9664-71af1446fd81)  

   ```
   http://localhost:35000/index.css
   ```
  ![image](https://github.com/CrisRod8/Taller4-AREP/assets/111186898/207af13c-f303-4842-a793-4c98807b31f8)

   ```
   http://localhost:35000/color.js
   ```
  ![image](https://github.com/CrisRod8/Taller4-AREP/assets/111186898/ef632b75-39d0-462c-a6e4-b9373e61478f)

  Si intentamos buscar una página que no existe con un servicio no implementado tendremos la siguiente respuesta:  
   ```
   http://localhost:35000/asdfg.html
   ```
  ![image](https://github.com/CrisRod8/Taller4-AREP/assets/111186898/6bbed4f4-ed3b-4083-8280-591ab24d591a)  
  
    
5. Para visualizar el javadoc ejecutamos el siguiente comando:
   ```
   mvn javadoc:javadoc
   ```
   y despues vamos a la carpeta target/site/apidocs acá encontraremos todos los documentos creados:

  ![image](https://github.com/CrisRod8/Taller4-AREP/assets/111186898/0db9d670-bb9e-4627-b3c5-0fdee3caa95b)
  
# DESCRIPCIÓN  
En este taller se hizo implementaron las anotaciones @Component y @RequestMapping con el objertivo de usarlas para identificar clases y métodos de nuetros controllers; siguiendo con la linea de la arquitectura enfocada en API Rest, usando patrones como el patrón de diseño SINGLETON para la implementación de servicios.

Patrones usados: Se usaron tanto el patrón de Fachada como el patrón Singleton.  

Extensibilidad: Como se tiene solo una clase para instanciar los servicios se repeta el patrón SINGLENTON y solo necesitamos especificar el path y la extensión para obtener los recursos correspondientes.  

Modularización: Todas clases implementan sus respectivos métodos en base al principio de única responsabilidad, para poder extender el código si este lo necesita.
 
