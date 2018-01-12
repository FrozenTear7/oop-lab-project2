import com.google.gson.Gson;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.IOException;

public class InputHandler {
    private String args[];

    @Option(name = "--apikey", usage = "Apikey provided by user")
    private String myApikey = "710e96247a0a4e05bb5b65c4a1c9f532";

    @Option(name = "--sensorid", usage = "Sensor id provided by user")
    private String sensorId = null;

    @Option(name = "--latitude", usage = "Latitude provided by user")
    private String latitude = null;

    @Option(name = "--longitude", usage = "Longitude provided by user")
    private String longitude = null;

    @Option(name = "--history", usage = "Check whether to show history")
    private boolean history = false;

    private String myUrl;

    public InputHandler(String args[]) {
        this.args = args;
    }

    public SensorIdInfo parseInput() throws Exception {
        CmdLineParser parser = new CmdLineParser(this);

        try {
            parser.parseArgument(args);
            checkArguments();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println();
            parser.printUsage(System.err);

            return null;
        }

        return parseInfo();
    }

    private void checkArguments() throws IOException {
        if (args.length == 0) {
            throw new IOException("No argument is given");
        } else if (latitude == null && longitude == null && sensorId == null) {
            throw new IOException("Provide sensor id or latitude&longitude to get info");
        } else if (latitude == null && longitude != null && sensorId == null) {
            System.out.println("Provide latitude to get nearest sensor's info");
        } else if (latitude != null && longitude == null && sensorId == null) {
            System.out.println("Provide longitude to get nearest sensor's info");
        }
    }

    public SensorIdInfo parseInfo() throws Exception {
        RequestHandler requestHandler = new RequestHandler();
        Gson gson = new Gson();

        if (!sensorId.equals("")) {
            myUrl = "https://airapi.airly.eu/v1/sensor/measurements?sensorId=" + sensorId;
        } else if (!latitude.equals("") && !longitude.equals("")) {
            myUrl = "https://airapi.airly.eu/v1/mapPoint/measurements?latitude=" + latitude + "&longitude=" + longitude;
        }

        return gson.fromJson(requestHandler.getSensorInfo(myUrl, myApikey), SensorIdInfo.class);
    }

    public boolean showHistory() {
        if(history)
            return true;
        else
            return false;
    }
}
