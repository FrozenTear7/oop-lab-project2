public class AirlyMain {
    public static void main(String args[]) throws Exception {
        InputHandler inputHandler = new InputHandler(args);

        SensorIdInfo sensorIdInfo = inputHandler.parseInput();

        if(sensorIdInfo == null)
            return;

        sensorIdInfo.printCurrentInfo();

        if(inputHandler.showHistory())
            sensorIdInfo.printHistoryInfo();
    }
}
