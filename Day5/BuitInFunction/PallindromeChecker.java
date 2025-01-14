import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Get the input string from the user
        String input = getInput("Enter a string to check if it's a palindrome: ");
        
        // Check if the string is a palindrome
        boolean isPalindrome = isPalindrome(input);
        
        // Display the result
        displayResult(input, isPalindrome);
    }

    // Function to get input from the user
    public static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase to handle phrases and case differences
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        // Check for palindrome by comparing characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // It's a palindrome
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
