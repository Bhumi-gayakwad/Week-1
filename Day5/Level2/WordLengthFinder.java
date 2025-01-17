import java.util.Scanner;

public class WordLengthFinder {

    // Method to find the length of a string without using length()
    public static int findStringLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exit the loop when IndexOutOfBoundsException is thrown
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitTextIntoWords(String text) {
        int length = findStringLength(text);

        // Count the number of words
        int wordCount = 1; // At least one word
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store the start and end indexes of each word
        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }

        // Extract words using indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[words.length - 1] = text.substring(start); // Last word

        return words;
    }

    // Method to generate a 2D array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(userInput);

        // Get words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the result in a tabular format
        System.out.printf("%-20s %-10s\n", "Word", "Length");
        System.out.println("---------------------");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.printf("%-20s %-10d\n", wordWithLength[0], Integer.parseInt(wordWithLength[1]));
        }

        scanner.close();
    }
}
