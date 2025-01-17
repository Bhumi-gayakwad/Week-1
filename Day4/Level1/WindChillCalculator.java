 import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    // Method to calculate sine, cosine, and tangent of an angle in degrees
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the angle input from the user
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        // Create an instance of the TrigonometricFunctionsCalculator class
        TrigonometricFunctionsCalculator calculator = new TrigonometricFunctionsCalculator();

        // Calculate the trigonometric functions
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Print the results
        System.out.println("For an angle of " + angle + " degrees:");
        System.out.println("Sine: " + String.format("%.4f", results[0]));
        System.out.println("Cosine: " + String.format("%.4f", results[1]));
        System.out.println("Tangent: " + String.format("%.4f", results[2]));

         
    }
}
