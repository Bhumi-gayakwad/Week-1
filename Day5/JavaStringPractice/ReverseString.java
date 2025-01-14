import java.util.Scanner;

public class ReverseString {

    // Method to reverse the string manually
    public static String reverseString(String text) {
        StringBuilder reversedString = new StringBuilder();

        // Loop through the string from the last character to the first
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedString.append(text.charAt(i)); // Append each character in reverse order
        }

        return reversedString.toString(); // Convert StringBuilder to String and return
    }

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for text
        System.out.println("Enter the string to reverse: ");
        String inputText = scanner.nextLine();

        // Call the method to reverse the string
        String reversedText = reverseString(inputText);

        // Display the reversed string
        System.out.println("Reversed String: " + reversedText);

        
    }
}
