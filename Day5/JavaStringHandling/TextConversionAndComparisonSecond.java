import java.util.Scanner;

public class TextConversionAndComparisonSecond {
    
    // Method to convert text to lowercase manually using ASCII values
    public static String convertToLowerCase(String text) {
        StringBuilder lowercaseText = new StringBuilder();
        
        // Convert each character to lowercase using ASCII value logic
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if character is uppercase
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert to lowercase by adding 32 to ASCII value
                currentChar = (char) (currentChar + 32);
            }
            lowercaseText.append(currentChar);
        }
        
        return lowercaseText.toString();
    }
    
    // Method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        // Compare each character of both strings using charAt method
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }

    // Method to split the text into words and return a 2D array of words and their lengths
    public static String[][] splitTextIntoWords(String text) {
        String[] words = text.split("\\s+"); // Split by spaces (whitespace characters)
        String[][] wordsWithLengths = new String[words.length][2];
        
        // Store each word and its length in the 2D array
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i]; // Word
            wordsWithLengths[i][1] = String.valueOf(words[i].length()); // Length of the word
        }
        
        return wordsWithLengths;
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for text
        System.out.println("Enter the text: ");
        String inputText = scanner.nextLine();

        // Convert the input text to lowercase using both methods
        String manualLowerCase = convertToLowerCase(inputText);
        String builtInLowerCase = inputText.toLowerCase();

        // Compare the two results using the compareStrings method
        boolean isEqual = compareStrings(manualLowerCase, builtInLowerCase);

        // Display the results of conversion and comparison
        System.out.println("Original Text: " + inputText);
        System.out.println("Converted (Manual) to Lowercase: " + manualLowerCase);
        System.out.println("Converted (Built-in) to Lowercase: " + builtInLowerCase);
        System.out.println("Are both lowercase texts equal? " + isEqual);

        // Split the text into words and display the 2D array
        String[][] wordsWithLengths = splitTextIntoWords(inputText);
        System.out.println("\nWords and their lengths:");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.println("Word: " + wordInfo[0] + ", Length: " + wordInfo[1]);
        }

        
    }
}
