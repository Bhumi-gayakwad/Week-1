import java.util.Scanner;

  class FactorsArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Check if the number is valid
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // Initialize variables
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If index reaches maxFactor, resize the array
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor]; // Temporary array
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy old factors
                    factors = temp; // Assign the temp array to factors
                }

                // Store the factor in the array
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

         
    }
}
