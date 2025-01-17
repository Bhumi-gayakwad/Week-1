import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
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

        // Take user input for the string and indices
        System.out.print("Enter the string: ");
        String str = scanner.next();

        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        // Create substring using charAt()
        String substringUsingCharAt = createSubstringUsingCharAt(str, start, end);

        // Create substring using substring()
        String substringUsingBuiltIn = str.substring(start, end);

        // Compare the two substrings
        boolean areSubstringsEqual = compareStringsUsingCharAt(substringUsingCharAt, substringUsingBuiltIn);

        // Display the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring(): " + substringUsingBuiltIn);
        System.out.println("Are the substrings equal? " + areSubstringsEqual);

        scanner.close();
    }
}
