import static spark.Spark.*;

public class SparkServer {

    public static void main(String[] args) {
        port(4567);

        get("/hello", (req, res) -> "Hello from Spark! My name is Javier");

        System.out.println("Spark server is running on port 4567");
    }
}
