import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the strings
        System.out.println("Enter String 1:");
        String string1 = scanner.nextLine();

        System.out.println("Enter String 2:");
        String string2 = scanner.nextLine();

        // Compare the strings
        int result = compareStrings(string1, string2);

        // Output the result
        if (result < 0) {
            System.out.println("String 1 comes before String 2 lexicographically.");
        } else if (result > 0) {
            System.out.println("String 1 comes after String 2 lexicographically.");
        } else {
            System.out.println("String 1 is equal to String 2 lexicographically.");
        }
    }

    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 != char2) {
                return char1 - char2; // Return the difference of the characters
            }
        }

        // If all characters are equal, compare lengths
        return length1 - length2;
    }
}
