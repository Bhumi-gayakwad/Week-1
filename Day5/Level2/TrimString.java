import java.util.Scanner;

public class TrimString {

    // Method to determine the start and end points without spaces
    public static int[] findStartAndEnd(String input) {
        int start = 0;
        int end = input.length() - 1;

        // Trim leading spaces
        while (start <= end && input.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && input.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String input, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++) {
            result.append(input.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
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
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String userInput = scanner.nextLine();

        // Trim spaces using custom method
        int[] boundaries = findStartAndEnd(userInput);
        String trimmedCustom = createSubstring(userInput, boundaries[0], boundaries[1]);

        // Trim spaces using built-in method
        String trimmedBuiltIn = userInput.trim();

        // Compare the two results
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("Custom trimmed string: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed string: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        scanner.close();
    }
}
