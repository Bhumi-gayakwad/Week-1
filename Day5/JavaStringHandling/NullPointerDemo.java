public class NullPointerDemo {

    // Method to generate a NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        
        // Attempting to call a method on a null object, which will generate a NullPointerException
        System.out.println("Length of the string: " + text.length());  // This will throw NullPointerException
    }

    // Method to demonstrate handling NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        
        // Using try-catch block to handle NullPointerException
        try {
            // Attempt to call a method on a null object
            System.out.println("Length of the string: " + text.length());  // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Caught a NullPointerException: Cannot call method on a null object.");
        }
    }

    public static void main(String[] args) {
        // Call the method that generates the NullPointerException
        System.out.println("Demonstrating NullPointerException generation:");
        generateNullPointerException();  // This will throw the exception and terminate the program

        // Refactor the code to handle the exception using try-catch
        System.out.println("\nDemonstrating NullPointerException handling:");
        handleNullPointerException();  // This will catch and handle the exception
    }
}
 