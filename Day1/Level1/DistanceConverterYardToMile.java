import java.util.Scanner;

  class DistanceConverterYardToMile{
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take the distance in feet as input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Output the results
        System.out.println("The distance is " + distanceInFeet + " feet, which is equivalent to "
                + distanceInYards + " yards and " + distanceInMiles + " miles.");

    }
}
