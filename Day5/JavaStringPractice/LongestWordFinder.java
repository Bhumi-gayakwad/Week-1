import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Reading the sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Find the longest word
        String longestWord = findLongestWord(sentence);

        // Output the result
        System.out.println("The longest word is: " + longestWord);

        scanner.close();
    }

    public static String findLongestWord(String sentence) {
        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            // Check if the character is part of a word
            if (Character.isLetterOrDigit(c)) {
                currentWord += c;
            } else {
                // End of a word
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = ""; // Reset for the next word
            }
        }

        // Check the last word in the sentence
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        return longestWord;
    }
}
