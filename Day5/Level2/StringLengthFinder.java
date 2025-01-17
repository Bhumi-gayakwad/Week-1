import java.util.Scanner;

public class StringLengthFinder {

    // Method to find the length of a string without using length()
    public static int findStringLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count); // Attempt to access the character at the current index
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception thrown when index is out of bounds, terminate counting
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Calculate length using custom method
        int calculatedLength = findStringLength(userInput);

        // Calculate length using built-in length() method
        int builtInLength = userInput.length();

        // Display the results
        System.out.println("Calculated length (custom method): " + calculatedLength);
        System.out.println("Actual length (built-in method): " + builtInLength);

        scanner.close();
    }
}
