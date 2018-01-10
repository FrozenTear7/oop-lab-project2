import com.google.gson.Gson;

public class AirlyMain {
    public static void main(String args[]) throws Exception {
        String myUrl = "https://airapi.airly.eu/v1/sensor/measurements?sensorId=397";
        String myApikey = "710e96247a0a4e05bb5b65c4a1c9f532";

        RequestHandler requestHandler = new RequestHandler();

        Gson gson = new Gson();
        SensorIdInfo sensorIdInfo = gson.fromJson(requestHandler.getSensorInfo(myUrl, myApikey), SensorIdInfo.class);

        sensorIdInfo.printCurrentInfo();

        sensorIdInfo.printHistoryInfo();
    }
}
