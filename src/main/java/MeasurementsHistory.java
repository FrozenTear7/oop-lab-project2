import com.google.gson.annotations.SerializedName;

public class MeasurementsHistory {
    private String fromDateTime, tillDateTime;

    @SerializedName("measurements")
    private Measurements measurements;

    public void printInfo() {
        System.out.println("__________________________");
        System.out.println("From: " + fromDateTime);
        System.out.println("To:   " + tillDateTime);
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        measurements.printInfo();
    }
}
