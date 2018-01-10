import com.google.gson.annotations.SerializedName;

public class SensorIdInfo {
    @SerializedName("currentMeasurements")
    private Measurements measurements;

    @SerializedName("history")
    private MeasurementsHistory[] history;

    public void printCurrentInfo () {
        measurements.printInfo();
    }

    public void printHistoryInfo () {
        for(MeasurementsHistory historyInfo: history) {
            historyInfo.printInfo();
        }
    }
}
