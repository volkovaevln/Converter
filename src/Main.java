public class Main {
    private static final double MILES_TO_KM_CONVERSION_COEFFICIENT = 1.60934;

    public static void main(String[] args) {
        System.out.println("A program for converting miles to kilometers and kilometers to miles.");

        double miles = 10;
        double kilometers = convertMilesToKilometers(miles);

        System.out.println(miles + " miles = " + kilometers + " kilometers");

        double kilometers2 = 10;
        double miles2 = convertKilometersToMiles(kilometers2);

        System.out.println(kilometers2 + " kilometers = " + miles2 + " miles");
    }

    private static double convertMilesToKilometers(double miles) {
        return miles * MILES_TO_KM_CONVERSION_COEFFICIENT;
    }

    private static double convertKilometersToMiles(double kilometers) {
        return kilometers / MILES_TO_KM_CONVERSION_COEFFICIENT;
    }
}
