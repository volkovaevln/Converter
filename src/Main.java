public class Main {
    private static final double MILES_TO_KM_CONVERSION_COEFFICIENT = 1.60934;

    public static void main(String[] args) {
        System.out.println("A program for converting miles to kilometers and kilometers to miles.");

        double miles = 10;
        double kilometers = convertMilesToKilometers(miles);

        System.out.println(miles + " miles = " + kilometers + " kilometers");

        double kilometersResult = 10;
        double milesResult = convertKilometersToMiles(kilometersResult);

        System.out.println(kilometersResult + " kilometers = " + milesResult + " miles");
    }

    private static double convertMilesToKilometers(double miles) {
        return miles * MILES_TO_KM_CONVERSION_COEFFICIENT;
    }

    private static double convertKilometersToMiles(double kilometers) {
        return kilometers / MILES_TO_KM_CONVERSION_COEFFICIENT;
    }
}
