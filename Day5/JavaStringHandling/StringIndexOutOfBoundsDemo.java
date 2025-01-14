import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) {
        // Attempting to access an index beyond the length of the string
        System.out.println("Accessing character at index 10: " + text.charAt(10));  // This will throw StringIndexOutOfBoundsException
    }

    // Method to demonstrate handling StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            // Attempt to access an index beyond the length of the string
            System.out.println("Accessing character at index 10: " + text.charAt(10));  // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Caught a StringIndexOutOfBoundsException: Index is out of range.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the string
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();  // Using nextLine() to allow spaces in the input string
        
        // Call the method that generates the StringIndexOutOfBoundsException
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException generation:");
        generateStringIndexOutOfBoundsException(userInput);  // This will throw the exception and stop the program
        
        // Call the method to handle the exception using try-catch block
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException handling:");
        handleStringIndexOutOfBoundsException(userInput);  // This will catch and handle the exception

         
    }
}
