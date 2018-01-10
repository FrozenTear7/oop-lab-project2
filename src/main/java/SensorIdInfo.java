import com.google.gson.annotations.SerializedName;

public class SensorIdInfo {
    @SerializedName("currentMeasurements")
    private Measurements measurements;

    @SerializedName("history")
    private MeasurementsHistory[] history;

    public void printInfo () {
        System.out.print(measurements);
        System.out.print(history);
    }
}
