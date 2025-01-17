import java.util.Scanner;

class MultiplicationTableUsingArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the number input from the user
        System.out.print("Enter a number to find the multiplication table (6 to 9): ");
        int number = scanner.nextInt();

        // Ensure the number is between 6 and 9
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
        } else {
            // Define an array to store the multiplication results
            int[] multiplicationResult = new int[10];

            // Calculate the multiplication table for the number
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = number * i;
            }

            // Display the multiplication table
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 0; i < 10; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
            }
        }

        
    }
}
