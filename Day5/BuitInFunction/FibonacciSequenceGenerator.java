import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        // Get the number of terms for the Fibonacci sequence
        int terms = getInput("Enter the number of terms for the Fibonacci sequence: ");
        
        // Generate and print the Fibonacci sequence
        generateFibonacci(terms);
    }

    // Function to get input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        // Handle edge case where terms are less than 1
        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        // First two numbers in the Fibonacci sequence
        int first = 0, second = 1;

        // Print the Fibonacci sequence
        System.out.println("Fibonacci Sequence up to " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {
            // Print the current term
            System.out.print(first + " ");

            // Calculate the next term in the sequence
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // Newline after the sequence
    }
}
