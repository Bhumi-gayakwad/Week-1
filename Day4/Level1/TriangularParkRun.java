import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the lengths of the three sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Compute the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Check if the perimeter is valid
        if (perimeter <= 0) {
            System.out.println("Invalid side lengths. Please enter positive values.");
        } else {
            // Calculate the number of rounds needed to complete a 5 km run
            double rounds = calculateRounds(perimeter, 5000); // 5000 meters = 5 km

            // Display the result
            System.out.println("The athlete needs to complete " + Math.ceil(rounds) + " rounds to complete a 5 km run.");
        }
 
    }

    // Method to calculate the perimeter of a triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed to complete the distance
    public static double calculateRounds(double perimeter, double distance) {
        return distance / perimeter;
    }
}
