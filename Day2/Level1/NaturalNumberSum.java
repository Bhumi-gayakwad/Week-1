import java.util.Scanner;

    class NaturalNumberSum {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take the number as input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number (positive integer including 0)
        if (number >= 0) {
            // Calculate the sum of n natural numbers using the formula
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }

    }
}
