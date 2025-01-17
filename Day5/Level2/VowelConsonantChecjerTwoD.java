import java.util.Scanner;

public class VowelConsonantCheckerTwoD{

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        char lowerCaseChar = Character.toLowerCase(ch);

        if (lowerCaseChar >= 'a' && lowerCaseChar <= 'z') {
            if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || lowerCaseChar == 'o' || lowerCaseChar == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find and classify characters in a string
    public static String[][] classifyCharacters(String input) {
        int length = input.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = checkCharacterType(currentChar);
        }

        return result;
    }

    // Method to display a 2D array in a tabular format
    public static void displayCharacterTable(String[][] data) {
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        System.out.println("----------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Classify characters in the string
        String[][] characterData = classifyCharacters(userInput);

        // Display the results in a tabular format
        displayCharacterTable(characterData);

        scanner.close();
    }
}
