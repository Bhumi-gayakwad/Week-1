import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings are not of the same length
        }
        
        // Compare character by character using charAt()
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Characters at position i are not the same
            }
        }
        return true; // Strings are identical
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for two strings
        System.out.println("Enter the first string:");
        String str1 = scanner.next();
        
        System.out.println("Enter the second string:");
        String str2 = scanner.next();
        
        // Compare using charAt()
        boolean resultUsingCharAt = compareStringsUsingCharAt(str1, str2);
        // Compare using the built-in equals() method
        boolean resultUsingEquals = str1.equals(str2);
        
        // Display results
        System.out.println("Result using charAt(): " + resultUsingCharAt);
        System.out.println("Result using equals(): " + resultUsingEquals);
        
        // Check if both results are the same
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results are different.");
        }
        
        
    }
}
