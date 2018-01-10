import com.google.gson.Gson;

public class AirlyMain {
    public static void main(String args[]) throws Exception {
        String myUrl = "https://airapi.airly.eu/v1/sensor/measurements?sensorId=397";

        RequestHandler requestHandler = new RequestHandler();

        Gson gson = new Gson();
        SensorIdInfo sensorIdInfo = gson.fromJson(requestHandler.getSensorInfo(myUrl), SensorIdInfo.class);

        sensorIdInfo.printInfo();
    }
}
