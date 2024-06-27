import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SparkClient {

    public static void main(String[] args) {
        String targetUrl = "http://192.168.43.55:4567/hello"; //Sustituir localhost por la ip del servidor

        try {
            URL url = new URL(targetUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            connection.disconnect();

            System.out.println("Response from server: " + content.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

