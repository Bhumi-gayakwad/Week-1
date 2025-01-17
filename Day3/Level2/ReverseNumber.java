import java.util.Scanner;

  class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Find the number of digits in the number
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            count++;
            tempNumber /= 10;
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        int index = 0;

        // Extract the digits and store them in the array
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Create an array to store the digits in reverse order
        int[] reversedDigits = new int[count];
        
        // Copy the digits into the reversedDigits array in reverse order
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Display the reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        
    }
}
