import java.util.Scanner;
  class NaturalNumberSumChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("The input must be a natural number (positive integer).");
        } else {
            // Compute the sum using the formula
            int sumUsingFormula = n * (n + 1) / 2;

            // Compute the sum using a while loop
            int sumUsingLoop = 0;
            int i = 1; // Counter starting from 1
            while (i <= n) {
                sumUsingLoop += i;
                i++;
            }

            // Display the results
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using while loop: " + sumUsingLoop);

            // Compare the results
            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("Both computations match! The results are correct.");
            } else {
                System.out.println("There is a mismatch between the two computations.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
