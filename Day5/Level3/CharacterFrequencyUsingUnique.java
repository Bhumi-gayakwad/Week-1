import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character has appeared before
            for (int j = 0; j < uniqueIndex; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        // Create a new array with the exact size of unique characters
        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to find the frequency of unique characters in a string and return them as a 2D array
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];  // Array to store the frequency of each ASCII character

        // Loop to calculate the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment the frequency at the index corresponding to the ASCII value of the character
        }

        // Call the uniqueCharacters method to get the unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];  // 2D array to store characters and their frequencies

        // Loop to populate the 2D array with characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  // Store the character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);  // Store the frequency
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the frequency of characters
        String[][] frequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + ": " + frequencies[i][1]);
        }
    }
}
