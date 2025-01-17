 import java.util.Scanner;

  class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take an integer input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 2: Create a variable to count the digits
        int count = 0;

        // Step 3: Use a loop to count the digits
        int originalNumber = number; // Store original number to handle negative numbers
        if (number == 0) {
            count = 1;  // Special case: if number is 0, it has 1 digit
        } else {
            while (number != 0) {
                number /= 10;  // Remove the last digit
                count++;       // Increase count by 1
            }
        }

        // Step 4: Display the count of digits
        System.out.println("The number of digits in " + originalNumber + " is: " + count);

        
    }
}
