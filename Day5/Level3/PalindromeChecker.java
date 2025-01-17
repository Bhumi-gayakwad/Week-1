public class PalindromeChecker {

    // Logic 1: Compare characters from start and end
    public static boolean isPalindromeUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeUsingRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeUsingRecursion(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseCharArray(original);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a char array
    public static char[] reverseCharArray(char[] array) {
        char[] reversed = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    // Main method to test all three logics
    public static void main(String[] args) {
        String text = "madam"; // Example palindrome

        // Normalize the string (optional if input has spaces or case differences)
        text = text.replaceAll("\\s", "").toLowerCase();

        // Logic 1
        boolean resultLoop = isPalindromeUsingLoop(text);
        System.out.println("Palindrome check using loop: " + resultLoop);

        // Logic 2
        boolean resultRecursion = isPalindromeUsingRecursion(text, 0, text.length() - 1);
        System.out.println("Palindrome check using recursion: " + resultRecursion);

        // Logic 3
        boolean resultCharArray = isPalindromeUsingCharArray(text);
        System.out.println("Palindrome check using char array: " + resultCharArray);

        // Final Result
        if (resultLoop && resultRecursion && resultCharArray) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}
