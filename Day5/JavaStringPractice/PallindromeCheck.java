import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Close the scanner to avoid memory leaks
        scanner.close();
        
        // Call the method to check for palindrome
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
    
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        // Loop to compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome if characters don't match
            }
            left++;
            right--;
        }
        
        return true; // String is a palindrome if we complete the loop
    }
}
