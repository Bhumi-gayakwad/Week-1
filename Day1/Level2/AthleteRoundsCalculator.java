import java.util.Scanner;

public class AthleteRoundsCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Total distance to run in meters (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate the number of rounds
        double rounds = totalDistance / perimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + 
                           " to complete 5 km.");

        // Close the scanner
        scanner.close();
    }
}
