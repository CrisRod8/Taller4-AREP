package edu.escuelaing.arep;

import java.io.IOException;

/**
 * Clase que corre a HttpServer
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HttpServer server = HttpServer.getInstance();
        server.run();
    }

}
