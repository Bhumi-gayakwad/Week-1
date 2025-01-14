import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) {
        // Attempting to call substring with start index greater than end index
        System.out.println("Attempting to extract a substring with invalid indices...");
        System.out.println(text.substring(5, 2));  // This will throw IllegalArgumentException
    }

    // Handling
    public static void handleIllegalArgumentException(String text) {
        try {
            // Attempt to call substring with start index greater than end index
            System.out.println("Attempting to extract a substring with invalid indices...");
            System.out.println(text.substring(5, 2));  // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            // Handling the IllegalArgumentException
            System.out.println("Caught an IllegalArgumentException: Start index is greater than the end index.");
        } catch (RuntimeException e) {
            // Generic handling for other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the string
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();  // Using nextLine() to allow spaces in the input string
        
        // Call the method that generates the IllegalArgumentException
        System.out.println("\nDemonstrating IllegalArgumentException generation:");
        generateIllegalArgumentException(userInput);  // This will throw the exception and stop the program
        
        // Call the method to handle the exception using try-catch block
        System.out.println("\nDemonstrating IllegalArgumentException handling:");
        handleIllegalArgumentException(userInput);  // This will catch and handle the exception

       
    }
}
