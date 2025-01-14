import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        // Attempting to access an index that is beyond the length of the array
        System.out.println("Attempting to access an index out of bounds...");
        System.out.println("Name at index 5: " + names[5]);  // This will throw ArrayIndexOutOfBoundsException if the array length is less than 6
    }

    // Method to demonstrate handling ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            // Attempt to access an index beyond the array length
            System.out.println("Attempting to access an index out of bounds...");
            System.out.println("Name at index 5: " + names[5]);  // This will throw ArrayIndexOutOfBoundsException if the array length is less than 6
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException
            System.out.println("Caught an ArrayIndexOutOfBoundsException: Index is out of range.");
        } catch (RuntimeException e) {
            // Generic handling for other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the size of the array
        System.out.println("Enter the number of names you want to store:");
        int numOfNames = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        
        // Create an array to store names
        String[] names = new String[numOfNames];
        
        // Take user input for names
        System.out.println("Enter the names:");
        for (int i = 0; i < numOfNames; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = scanner.nextLine();
        }
        
        // Call the method that generates the ArrayIndexOutOfBoundsException
        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException generation:");
        generateArrayIndexOutOfBoundsException(names);  // This will throw the exception and stop the program
        
        // Call the method to handle the exception using try-catch block
        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException handling:");
        handleArrayIndexOutOfBoundsException(names);  // This will catch and handle the exception
 
    }
}
