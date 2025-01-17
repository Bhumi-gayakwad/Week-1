import java.util.Scanner;

  class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total to 0.0
        double total = 0.0;

        // Infinite while loop
        while (true) {
            // take user input
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = scanner.nextDouble();

            // Check if the input is 0 or negative to exit the loop
            if (userInput <= 0) {
                break;
            }

            // Add the user's input to the total
            total += userInput;
        }

        // Display the total
        System.out.println("The total sum is: " + total);

        
    }
}
