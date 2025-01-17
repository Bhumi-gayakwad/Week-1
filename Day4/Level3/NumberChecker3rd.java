import java.util.Arrays;

public class NumberChecker3rd {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if the number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if the number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        // Duck number should have at least one non-zero digit and should not start with zero
        for (int digit : digits) {
            if (digit != 0) {
                return true; // The number contains at least one non-zero digit
            }
        }
        return false;
    }

    // Main method to test all the methods
    public static void main(String[] args) {
        int number = 1021; // Example number for testing

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        // Check if the number is a duck number
        if (isDuckNumber(number)) {
            System.out.println(number + " is a duck number.");
        } else {
            System.out.println(number + " is not a duck number.");
        }

        // Reverse the digits array
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));

        // Compare the original digits and reversed digits
        if (areArraysEqual(digits, reversedDigits)) {
            System.out.println("The original and reversed arrays are the same.");
        } else {
            System.out.println("The original and reversed arrays are different.");
        }
    }
}
