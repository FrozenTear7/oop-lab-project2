import com.google.gson.Gson;

public class AirlyMain {
    public static void main(String args[]) throws Exception {
        String sensorId = "397", latitude = "50.1246", longitude = "19.82208", maxDistance = "1000";
        String myUrl = "https://airapi.airly.eu/v1/sensor/measurements?sensorId=" + sensorId;
        String myUrl2 = "https://airapi.airly.eu/v1/nearestSensor/measurements?latitude=" + latitude + "&longitude=" + longitude + "&maxDistance=" + maxDistance;
        String myApikey = "710e96247a0a4e05bb5b65c4a1c9f532";

        RequestHandler requestHandler = new RequestHandler();

        Gson gson = new Gson();
        //SensorIdInfo sensorIdInfo = gson.fromJson(requestHandler.getSensorInfo(myUrl2, myApikey), SensorIdInfo.class);

        GeoInfo geoInfo = gson.fromJson(requestHandler.getSensorInfo(myUrl2, myApikey), GeoInfo.class);
        geoInfo.printInfo();
/*
        sensorIdInfo.printCurrentInfo();

        sensorIdInfo.printHistoryInfo();*/
    }
}
