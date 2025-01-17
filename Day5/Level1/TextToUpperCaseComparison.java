 import java.util.Scanner;

public class TextToUpperCaseComparison {

    // Method to convert text to uppercase using charAt()
    public static String convertToUpperCaseUsingCharAt(String str) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperCaseText.append((char) (ch - 32));
            } else {
                upperCaseText.append(ch);
            }
        }
        return upperCaseText.toString();
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

        // Convert to uppercase using the user-defined method
        String upperCaseUsingMethod = convertToUpperCaseUsingCharAt(str);

        // Convert to uppercase using the built-in toUpperCase() method
        String upperCaseUsingBuiltIn = str.toUpperCase();

        // Compare the two results
        boolean areStringsEqual = compareStringsUsingCharAt(upperCaseUsingMethod, upperCaseUsingBuiltIn);

        // Display the results
        System.out.println("Uppercase using user-defined method: " + upperCaseUsingMethod);
        System.out.println("Uppercase using toUpperCase() method: " + upperCaseUsingBuiltIn);
        System.out.println("Are the results equal? " + areStringsEqual);

        scanner.close();
    }
}
