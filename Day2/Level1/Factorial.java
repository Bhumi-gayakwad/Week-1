import java.util.Scanner;

  class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize variables
            long factorial = 1; // Factorial result (use long to handle large results)
            int i = 1;          // Counter for the while loop

            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i; // Multiply factorial by the current counter
                i++;            // Increment the counter
            }

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

      
    }
}
