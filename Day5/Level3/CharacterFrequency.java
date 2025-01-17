import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string using charAt() method
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];  // Array to store the frequency of each ASCII character

        // Loop to calculate the frequency of each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  // Increment the frequency at the index corresponding to the ASCII value of the character
        }

        // Create a 2D array to store characters and their frequencies
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        String[][] result = new String[uniqueCharCount][2];  // 2D array to store characters and their frequencies
        int index = 0;

        // Loop to populate the 2D array with characters and their frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  // Store the character
                result[index][1] = String.valueOf(frequency[i]);  // Store the frequency
                index++;
            }
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
