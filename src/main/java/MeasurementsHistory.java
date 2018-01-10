import com.google.gson.annotations.SerializedName;

public class MeasurementsHistory {
    private String fromDateTime, tillDateTime;

    @SerializedName("measurements")
    private Measurements measurements;

    public void printInfo() {
        System.out.println("Sensor information from: " + fromDateTime + " to: " + tillDateTime + "\n");
        measurements.printInfo();
    }
}