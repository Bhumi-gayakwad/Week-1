import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel or consonant
    public static String checkCharacterType(char ch) {
        char lowerCaseChar = Character.toLowerCase(ch);

        if ((lowerCaseChar >= 'a' && lowerCaseChar <= 'z')) {
            if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String input) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            String type = checkCharacterType(currentChar);

            if (type.equals("Vowel")) {
                vowelsCount++;
            } else if (type.equals("Consonant")) {
                consonantsCount++;
            }
        }

        return new int[]{vowelsCount, consonantsCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Count vowels and consonants
        int[] counts = countVowelsAndConsonants(userInput);

        // Display the results
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        scanner.close();
    }
}
