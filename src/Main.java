public class Main {
    private static final double MILES_TO_KM = 1.60934;

    public static void main(String[] args){
        System.out.println("A program for converting miles to kilometers and kilometers to miles.");

        double miles = 10;
        double kilometers = convertMilesToKilometers(miles);

        System.out.println(miles + " miles = " + kilometers + " kilometers");
    }

    private static double convertMilesToKilometers(double miles){
        return miles * MILES_TO_KM;
    }
}
