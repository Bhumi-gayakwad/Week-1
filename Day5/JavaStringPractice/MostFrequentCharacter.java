import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Find the most frequent character
        char mostFrequent = findMostFrequentCharacter(input);

        // Output the result
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }

    public static char findMostFrequentCharacter(String str) {
        // Convert the string to lowercase to handle case-insensitivity
        str = str.toLowerCase();

        // Array to store frequency of each character (a-z)
        int[] frequency = new int[26];

        // Count frequencies
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { // Only consider alphabetic characters
                frequency[ch - 'a']++;
            }
        }

        // Find the character with the highest frequency
        int maxFrequency = 0;
        char mostFrequentChar = ' ';

        for (int i = 0; i < 26; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequentChar = (char) (i + 'a');
            }
        }

        return mostFrequentChar;
    }
}
