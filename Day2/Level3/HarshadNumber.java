import java.util.Scanner;

 class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take an integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Create a variable to store the sum of digits
        int sum = 0;
        int originalNumber = number; // Store original number for later comparison

        // Step 3: Use a while loop to calculate the sum of digits
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            sum += digit;             // Add the digit to the sum
            number /= 10;             // Remove the last digit
        }

        // Step 4: Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

         
    }
}
