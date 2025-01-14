 import java.util.Scanner;

public class TextConversionAndComparison {
    
    // Method to convert text to uppercase manually using ASCII values
    public static String convertToUpperCase(String text) {
        StringBuilder uppercaseText = new StringBuilder();
        
        // Convert each character to uppercase using ASCII value logic
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            // Check if character is lowercase
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                currentChar = (char) (currentChar - 32);
            }
            uppercaseText.append(currentChar);
        }
        
        return uppercaseText.toString();
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

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for text
        System.out.println("Enter the text: ");
        String inputText = scanner.nextLine();

        // Convert the input text to uppercase using both methods
        String manualUpperCase = convertToUpperCase(inputText);
        String builtInUpperCase = inputText.toUpperCase();

        // Compare the two results using the compareStrings method
        boolean isEqual = compareStrings(manualUpperCase, builtInUpperCase);

        // Display the results
        System.out.println("Original Text: " + inputText);
        System.out.println("Converted (Manual) to Uppercase: " + manualUpperCase);
        System.out.println("Converted (Built-in) to Uppercase: " + builtInUpperCase);
        System.out.println("Are both uppercase texts equal? " + isEqual);
         
    }
}
