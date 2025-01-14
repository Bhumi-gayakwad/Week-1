import java.util.Scanner;

public class WordReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Input the word to be replaced
        System.out.println("Enter the word to be replaced:");
        String wordToReplace = scanner.nextLine();

        // Input the word to replace with
        System.out.println("Enter the replacement word:");
        String replacementWord = scanner.nextLine();

        // Replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);

        // Output the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Use StringBuilder to build the modified sentence
        StringBuilder result = new StringBuilder();

        // Iterate through each word and replace if it matches
        for (String word : words) {
            if (word.equals(wordToReplace)) {
                result.append(replacementWord); // Replace the word
            } else {
                result.append(word); // Keep the original word
            }
            result.append(" "); // Add space between words
        }

        return result.toString().trim(); // Trim to remove the trailing space
    }
}
