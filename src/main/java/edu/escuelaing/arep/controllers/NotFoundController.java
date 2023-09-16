package edu.escuelaing.arep.controllers;

import edu.escuelaing.arep.anotaciones.Controller;
import edu.escuelaing.arep.anotaciones.RequestMapping;
import edu.escuelaing.arep.requesters.RequestFile;

@Controller
/**
 * cargar todas las páginas web conocidas guardadas en memoria
 */
public class NotFoundController {

    private static final RequestFile requestFile = RequestFile.getInstance();

    /**
     * Carga el HTML de la página deL index
     * @return Retorna el header y el body del HTML
     */
    @RequestMapping("/")
    public static String index(){
        requestFile.setPath("/index.html");
        requestFile.setType("text/html");
        requestFile.setCode("/200 OK");
        requestFile.setBody();

        return requestFile.getResponse();
    }

    /**
     * Carga el JS de la página deL index
     * @return Retorna el header y el body del JS
     */
    @RequestMapping("/color.js")
    public static String colorJS(){
        requestFile.setPath("/color.js");
        requestFile.setType("text/js");
        requestFile.setCode("/200 OK");
        requestFile.setBody();

        return requestFile.getResponse();
    }

    /**
     * Carga el CSS de la página deL index
     * @return Retorna el header y el body del CSS
     */
    @RequestMapping("/index.css")
    public static String indexCSS(){
        requestFile.setPath("/index.css");
        requestFile.setType("text/css");
        requestFile.setCode("/200 OK");
        requestFile.setBody();

        return requestFile.getResponse();
    }

    /**
     * Carga un mensaje precargado
     * @return Retorna el header y el body del mensaje
     */
    @RequestMapping("/hello")
    public static String hello(){
        return "HTTP/1.1 200 \r\n" +
                "Content-Type:text/html\r\n" +
                "\r\n"+
                "Greetings from Spring Boot!";
    }


}
