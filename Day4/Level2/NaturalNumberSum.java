import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method to calculate the sum of n natural numbers
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1; // Base case
        }
        return n + recursiveSum(n - 1); // Recursive case
    }

    // Method to calculate the sum using the formula n * (n + 1) / 2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (n > 0). Exiting...");
            scanner.close();
            return;
        }

        // Calculate the sum using recursion
        int recursiveResult = recursiveSum(n);

        // Calculate the sum using the formula
        int formulaResult = formulaSum(n);

        // Display the results
        System.out.println("Sum calculated using recursion: " + recursiveResult);
        System.out.println("Sum calculated using the formula: " + formulaResult);

        // Verify that the two results match
        if (recursiveResult == formulaResult) {
            System.out.println("The results from both methods match. The calculation is correct.");
        } else {
            System.out.println("The results do not match. Please check the methods.");
        }

    }
}
