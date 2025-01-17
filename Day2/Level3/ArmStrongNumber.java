import java.util.Scanner;

  class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take an integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Define and initialize variables
        int sum = 0;              // Variable to store the sum of cubes of digits
        int originalNumber = number; // Store the original number to compare later

        // Step 3: Use while loop to iterate through each digit of the number
        while (number != 0) {
            int digit = number % 10;      // Find the remainder (last digit)
            sum += Math.pow(digit, 3);    // Add the cube of the digit to the sum
            number /= 10;                 // Remove the last digit by dividing the number by 10
        }

        // Step 4: Check if the sum of cubes equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

         
    }
}
