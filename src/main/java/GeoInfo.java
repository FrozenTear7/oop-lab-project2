public class GeoInfo {
    private String name;
    private double id, airQualityIndex, pm25, pm10;

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public void printInfo() {
        System.out.println("Current sensor information: \n");
        System.out.println("Name: " + name);
        System.out.println("Sensor id: " + id);
        System.out.println("Air quality index: " + round(airQualityIndex, 2));
        System.out.println("Pm 2.5: " + round(pm25, 2));
        System.out.println("Pm 10: " + round(pm10, 2));
    }
}
