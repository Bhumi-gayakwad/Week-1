 import java.util.Scanner;

  class NaturalNumberSumForLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // take user input
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("The input must be a natural number (positive integer).");
        } else {
            // Compute the sum using the formula
            int sumUsingFormula = n * (n + 1) / 2;

            // Compute the sum using a for loop
            int sumUsingForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumUsingForLoop += i;
            }

            // Display the results
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using for loop: " + sumUsingForLoop);

            // Compare the results
            if (sumUsingFormula == sumUsingForLoop) {
                System.out.println("Both computations match! The results are correct.");
            } else {
                System.out.println("There is a mismatch between the two computations.");
            }
        }

         
    }
}
