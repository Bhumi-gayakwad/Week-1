import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Toggle case
        String toggledString = toggleCase(input);

        // Output the result
        System.out.println("String after toggling case:");
        System.out.println(toggledString);
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character
        for (char ch : str.toCharArray()) {
            // Check if the character is uppercase
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            // Check if the character is lowercase
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                // Non-alphabetic characters remain unchanged
                result.append(ch);
            }
        }

        return result.toString();
    }
}
