import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class AirlyMain {
    public static void main(String args[]) throws Exception {
        String stringUrl = "https://airapi.airly.eu/v1/sensor/measurements?sensorId=397";
        URL url = new URL(stringUrl);
        URLConnection uc = url.openConnection();

        uc.setRequestProperty("Accept", "application/json");
        uc.setRequestProperty("apikey", "710e96247a0a4e05bb5b65c4a1c9f532");

        BufferedReader in = new BufferedReader(new InputStreamReader(
                uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
