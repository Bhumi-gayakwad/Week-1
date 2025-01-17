import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of a string without using length()
    public static int getStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length); // Throws IndexOutOfBoundsException when length exceeds
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = getStringLength(text);
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

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(input);

        // Display the result
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}
