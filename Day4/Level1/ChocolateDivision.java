import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the number of chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if the number of children is not zero
        if (numberOfChildren == 0) {
            System.out.println("Division by zero is not allowed. Please enter a valid number of children.");
        } else {
            // Call the method to find the quotient and remainder
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the results
            System.out.println("Each child will get: " + result[1] + " chocolates");
            System.out.println("Remaining chocolates: " + result[0]);
        }

         
    }

    // Method to find the remainder and quotient of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor; // Calculate the remainder
        int quotient = number / divisor; // Calculate the quotient
        return new int[]{remainder, quotient}; // Return as an array
    }
}
