import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {

    // Method to find the frequency of characters in a string and return the characters and their frequencies
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();  // Convert the string to a character array
        int[] frequency = new int[characters.length];  // Array to store the frequency of each character
        StringBuilder result = new StringBuilder();  // StringBuilder to store the result as a string

        // Loop through each character in the text (Outer loop)
        for (int i = 0; i < characters.length; i++) {
            // Skip the character if it's already counted (duplicate character)
            if (characters[i] == '0') {
                continue;
            }
            int count = 1;  // Initialize the frequency of the current character to 1

            // Loop through remaining characters to check for duplicates (Inner loop)
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    count++;  // Increment the frequency if a duplicate is found
                    characters[j] = '0';  // Set the duplicate character to '0' to avoid recounting
                }
            }

            // Store the character and its frequency in the result
            result.append(characters[i]).append(": ").append(count).append("\n");
        }

        // Convert the StringBuilder to a String array and return it
        return result.toString().split("\n");
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the frequency of characters
        String[] frequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (String freq : frequencies) {
            if (!freq.isEmpty()) {
                System.out.println(freq);
            }
        }
    }
}
