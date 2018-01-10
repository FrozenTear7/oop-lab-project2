import com.google.gson.annotations.SerializedName;

public class MeasurementsHistory {
    private String fromDateTime, tillDateTime;

    @SerializedName("measurements")
    private Measurements measurements;
}
