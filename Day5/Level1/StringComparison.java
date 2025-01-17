import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        // Check if the lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();

        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // Compare using charAt()
        boolean resultUsingCharAt = compareStringsUsingCharAt(str1, str2);

        // Compare using equals()
        boolean resultUsingEquals = str1.equals(str2);

        // Display the results
        System.out.println("Comparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEquals);

        // Check if the results are the same
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }

        scanner.close();
    }
}
