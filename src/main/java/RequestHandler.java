import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestHandler {
    public static String getHTML() throws Exception {
        StringBuilder result = new StringBuilder();
        URL url = new URL("https://airapi.airly.eu/v1/sensor/measurements?sensorId=397");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();

        System.out.println(result);

        return result.toString();
    }
}