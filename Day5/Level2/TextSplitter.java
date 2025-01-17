import java.util.Scanner;

public class TextSplitter {

    // Method to find the length of a string without using length()
    public static int findStringLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Do nothing, just exit the loop
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

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // Split using custom method
        String[] customSplit = splitTextIntoWords(userInput);

        // Split using built-in split() method
        String[] builtInSplit = userInput.split(" ");

        // Compare the two results
        boolean areEqual = compareStringArrays(customSplit, builtInSplit);

        // Display results
        System.out.println("Custom split result:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nBuilt-in split result:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("\nAre the results equal? " + areEqual);

        scanner.close();
    }
}
