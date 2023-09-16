package edu.escuelaing.arep.controllers;

import edu.escuelaing.arep.anotaciones.Controller;
import edu.escuelaing.arep.anotaciones.RequestMapping;
import edu.escuelaing.arep.requesters.RequestImage;

import java.io.IOException;

@Controller
/**
 * Cargar las imagenes que se encuentren guardadas en memoria
 */
public class ImageController {

    private static final RequestImage requestImage = RequestImage.getInstance();

    /**
     * Carga la imagen de Hu Tao guardada en memoria
     * @return Encabezado y body con la imagen a visualizar
     */
    @RequestMapping("/ok")
    public static String ok(){
        requestImage.setPath("/ok.png");
        requestImage.setType("image/png");
        requestImage.setCode("/200 OK");
        try {
            requestImage.setBody();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return requestImage.getResponse();
    }

}
