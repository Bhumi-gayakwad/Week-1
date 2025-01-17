public class UnitConverterYardToFeet {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter class

        double yards = 5.0;
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");

        double feet = 15.0;
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");

        double meters = 2.0;
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");

        double inches = 40.0;
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");

        System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + " centimeters.");
    }
}
