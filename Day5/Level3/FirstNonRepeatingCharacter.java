import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character using charAt() method
    public static char firstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256];  // Array to store the frequency of each ASCII character

        // Loop to calculate the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment the frequency at the index corresponding to the ASCII value of the character
        }

        // Loop through the string again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {  // If the frequency is 1, it's non-repeating
                return currentChar;
            }
        }

        // Return a placeholder character if no non-repeating character is found
        return '\0';  // This represents 'null' or no valid character
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the first non-repeating character
        char result = firstNonRepeatingCharacter(input);

        // Display the result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
