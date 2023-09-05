package edu.escuelaing.arep;

import edu.escuelaing.arep.sparkService.Spark;

import java.io.IOException;

/**
 * Clase que corre a HttpServer
 */
public class Main {


    public static void main(String[] args) throws IOException {
        Spark spark = Spark.getInstance();
        spark.get("/", ((request, response) -> {
            response.setType("application/json");
            return response.getResponse();
        }));
        HttpServer server = HttpServer.getInstance();
        server.run(args);
    }

}
