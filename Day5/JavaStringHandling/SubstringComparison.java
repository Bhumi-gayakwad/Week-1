import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using the charAt() method
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        
        // Extract characters from start to end index using charAt()
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        
        return substring.toString(); // Return the resulting substring
    }

    // Method to compare two strings and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2); // Compare strings using the equals() method
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the string and the start and end indices
        System.out.println("Enter the string:");
        String str = scanner.next();
        
        System.out.println("Enter the starting index for the substring:");
        int start = scanner.nextInt();
        
        System.out.println("Enter the ending index for the substring:");
        int end = scanner.nextInt();
        
        // Create substring using charAt() method
        String substringUsingCharAt = substringUsingCharAt(str, start, end);
        
        // Create substring using the built-in substring() method
        String substringUsingSubstringMethod = str.substring(start, end);
        
        // Compare the two substrings
        boolean result = compareStrings(substringUsingCharAt, substringUsingSubstringMethod);
        
        // Display the results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring() method: " + substringUsingSubstringMethod);
        System.out.println("Do the two substrings match? " + result);
        
         
    }
}
