import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take the perimeter of the square as input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side length of the square (Perimeter = 4 * side)
        double side = perimeter / 4;

        // Output the length of the side and the perimeter
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        
    }
}
