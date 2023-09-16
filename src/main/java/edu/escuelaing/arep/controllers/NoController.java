package edu.escuelaing.arep.controllers;

import edu.escuelaing.arep.anotaciones.RequestMapping;
import edu.escuelaing.arep.requesters.RequestFile;

/**
 * Clase que no es un controlador, usada principalmente para verificar el funcionamiento de la etiqueta Controller
 */
public class NoController {

    private static RequestFile requestFile = RequestFile.getInstance();
    @RequestMapping("/test")
    /**
     * Carga un HTML cualquiera
     */
    public static String index(){
        requestFile.setPath("/index.html");
        requestFile.setType("text/html");
        requestFile.setCode("/200 OK");
        requestFile.setBody();

        return requestFile.getResponse();
    }
}
