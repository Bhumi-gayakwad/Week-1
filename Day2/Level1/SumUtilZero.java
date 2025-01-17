import java.util.Scanner;

  class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total to 0.0
        double total = 0.0;

        // Variable to store the user's input
        double userInput;

        // Prompt the user for input
        System.out.println("Enter numbers to add to the total (enter 0 to stop):");

        // Use a while loop to keep summing until the user enters 0
        while (true) {
            // Read the user's input
            userInput = scanner.nextDouble();

            // Check if the input is 0, then exit the loop
            if (userInput == 0) {
                break;
            }

            // Add the user's input to the total
            total += userInput;
        }

        // Display the total
        System.out.println("The total sum is: " + total);

    }
}
