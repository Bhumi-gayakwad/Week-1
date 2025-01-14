import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        // Input the second string
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Check if the strings are anagrams
        boolean areAnagrams = areAnagrams(str1, str2);

        // Output the result
        if (areAnagrams) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        // Compare the sorted arrays
        return java.util.Arrays.equals(arr1, arr2);
    }
}
