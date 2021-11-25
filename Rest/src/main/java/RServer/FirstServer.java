package RServer;

import static spark.Spark.get;
import static spark.Spark.port;

public class FirstServer {

    public void run() {
        // Start embedded server at this port
        port(8090);

        // Configure resources
        get("/", (request, response) -> "Hello World!");
        get("/products", (request, response) -> "Tutti i prodotti");
    }

    public static void main(String[] args) {

        new FirstServer().run();
    }
}