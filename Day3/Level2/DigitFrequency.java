import java.util.Scanner;

  class DigitFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an array to store the frequency of each digit  
        int[] frequency = new int[10];

        // Find the digits of the number and update their frequency  
        int tempNumber = number; // to keep the original number intact
        while (tempNumber > 0) {
            int digit = tempNumber % 10; // extract the last digit
            frequency[digit]++; // increase the frequency of the digit
            tempNumber /= 10; // remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

    }
}
