import java.util.Scanner;

  class LargestAndSecondLargestDigitArray {

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
        int maxDigit = 10; // Initial size of the array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            if (index >= maxDigit) {
                // Increase the size of the digits array by 10 when it exceeds maxDigit
                maxDigit += 10;
                
                // Create a new temporary array with the increased size
                int[] temp = new int[maxDigit];
                
                // Copy the current digits into the temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                
                // Assign the temp array to digits
                digits = temp;
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
