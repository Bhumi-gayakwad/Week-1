import java.util.Scanner;

  class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check for natural number (greater than 0)
        if (number <= 0) {
            System.out.println("Please enter a natural number (positive integer greater than 0).");
        } else {
            // Calculate factorial using for loop
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        
    }
}
