import java.util.Scanner;

public class StringLengthAnalysis {

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

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLength = Integer.parseInt(wordsWithLengths[0][1]);

        for (int i = 1; i < wordsWithLengths.length; i++) {
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            if (length < shortestLength) {
                shortest = wordsWithLengths[i][0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longest = wordsWithLengths[i][0];
                longestLength = length;
            }
        }

        return new String[]{shortest, longest};
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

        // Find the shortest and longest words
        String[] result = findShortestAndLongest(wordsWithLengths);

        // Display the result
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);

        scanner.close();
    }
}
