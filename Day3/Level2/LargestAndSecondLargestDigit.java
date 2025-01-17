import java.util.Scanner;

 class LargestAndSecondLargestDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Initialize variables
        final int maxDigit = 10; // Maximum size of the array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            if (index >= maxDigit) {
                System.out.println("Warning: Only the first 10 digits are considered.");
                break;
            }
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++;
        }

        // Variables to find the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }

        // Display the results
        System.out.println("Digits of the number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

    }
}
