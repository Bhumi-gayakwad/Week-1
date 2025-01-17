import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take base and height as input from the user
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle in square inches
        double areaInInches = 0.5 * base * height;

        // Convert the area to square centimeters (1 inch = 2.54 cm)
        double areaInCm = areaInInches * Math.pow(2.54, 2);

        // Output the area in both square inches and square centimeters
        System.out.println("The area of the triangle is " + areaInInches + " square inches and "
                + areaInCm + " square centimeters.");

    }
}
