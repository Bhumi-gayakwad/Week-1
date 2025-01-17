import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is not zero
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed. Please enter a valid divisor.");
        } else {
            // Call the method to find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the results
            System.out.println("Quotient: " + result[1]);
            System.out.println("Remainder: " + result[0]);
        }

        
    }

    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor; // Calculate the remainder
        int quotient = number / divisor; // Calculate the quotient
        return new int[]{remainder, quotient}; // Return as an array
    }
}
