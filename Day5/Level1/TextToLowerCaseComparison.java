import java.util.Scanner;

public class TextToLowerCaseComparison {

    // Method to convert text to lowercase using charAt()
    public static String convertToLowerCaseUsingCharAt(String str) {
        StringBuilder lowerCaseText = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerCaseText.append((char) (ch + 32));
            } else {
                lowerCaseText.append(ch);
            }
        }
        return lowerCaseText.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
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

        // Take user input for the string
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        // Convert to lowercase using the user-defined method
        String lowerCaseUsingMethod = convertToLowerCaseUsingCharAt(str);

        // Convert to lowercase using the built-in toLowerCase() method
        String lowerCaseUsingBuiltIn = str.toLowerCase();

        // Compare the two results
        boolean areStringsEqual = compareStringsUsingCharAt(lowerCaseUsingMethod, lowerCaseUsingBuiltIn);

        // Display the results
        System.out.println("Lowercase using user-defined method: " + lowerCaseUsingMethod);
        System.out.println("Lowercase using toLowerCase() method: " + lowerCaseUsingBuiltIn);
        System.out.println("Are the results equal? " + areStringsEqual);

        scanner.close();
    }
}
