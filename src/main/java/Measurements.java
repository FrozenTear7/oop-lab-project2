public class Measurements {
    private double airQualityIndex, pm25, pm10, pressure, humidity, temperature;

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public void printInfo() {
        System.out.println("Current sensor information: \n");
        System.out.println("Air quality index: " + round(airQualityIndex, 2));
        System.out.println("Pm 2.5: " + round(pm25, 2));
        System.out.println("Pm 10: " + round(pm10, 2));
        System.out.println("Pressure: " + round(pressure, 2));
        System.out.println("Humidity: " + round(humidity, 2));
        System.out.println("Temperature: " + round(temperature, 2) + "\n");
    }
}
