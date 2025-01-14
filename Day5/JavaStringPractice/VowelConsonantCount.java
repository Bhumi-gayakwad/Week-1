 import java.util.Scanner;

public class VowelConsonantCount {

    // Method to count vowels and consonants
    public static void countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase for uniformity
        text = text.toLowerCase();

        // Loop through the string and count vowels and consonants
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(currentChar)) {
                // Check if the character is a vowel
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Display the result
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for text
        System.out.println("Enter the text: ");
        String inputText = scanner.nextLine();

        // Call the method to count vowels and consonants
        countVowelsAndConsonants(inputText);

         
    }
}
