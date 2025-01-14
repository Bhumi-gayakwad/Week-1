import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // Attempting to convert a non-numeric string to an integer using Integer.parseInt()
        System.out.println("Attempting to parse the text as an integer...");
        int number = Integer.parseInt(text);  // This will throw NumberFormatException if text is not a valid integer
        System.out.println("Parsed number: " + number);
    }

    // Method to demonstrate handling NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            // Attempting to convert a non-numeric string to an integer
            System.out.println("Attempting to parse the text as an integer...");
            int number = Integer.parseInt(text);  // This will throw NumberFormatException if text is not a valid integer
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handling the NumberFormatException
            System.out.println("Caught a NumberFormatException: Invalid input, unable to parse the text as a number.");
        } catch (RuntimeException e) {
            // Generic handling for other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the text
        System.out.println("Enter a string (attempt to parse it to an integer):");
        String userInput = scanner.nextLine();  // Using nextLine() to allow the input text to contain spaces
        
        // Call the method that generates the NumberFormatException
        System.out.println("\nDemonstrating NumberFormatException generation:");
        generateNumberFormatException(userInput);  // This will throw the exception and stop the program
        
        // Call the method to handle the exception using try-catch block
        System.out.println("\nDemonstrating NumberFormatException handling:");
        handleNumberFormatException(userInput);  // This will catch and handle the exception

        
    }
}
