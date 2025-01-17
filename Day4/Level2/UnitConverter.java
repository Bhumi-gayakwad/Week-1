public class UnitConverter {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter class

        double km = 5.0;
        System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");

        double miles = 3.1;
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");

        double meters = 10.0;
        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");

        double feet = 32.8;
        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
    }
}
