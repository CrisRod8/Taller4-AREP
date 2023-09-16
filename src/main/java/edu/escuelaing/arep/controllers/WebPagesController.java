package edu.escuelaing.arep.controllers;

import edu.escuelaing.arep.anotaciones.Controller;
import edu.escuelaing.arep.anotaciones.RequestMapping;
import edu.escuelaing.arep.requesters.RequestFile;

@Controller
/**
 * Clase encargada de cargar los archivos necesarios para visualizar la página de error 404
 */
public class WebPagesController {

    private static final RequestFile requestFile = RequestFile.getInstance();

    /**
     * Carga el HTML de la página de 404
     * @return Retorna el header y el body del HTML
     */
    @RequestMapping("/error")
    public static String error(){
        requestFile.setPath("/error.html");
        requestFile.setType("text/html");
        requestFile.setCode("/404 Not Found");
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
