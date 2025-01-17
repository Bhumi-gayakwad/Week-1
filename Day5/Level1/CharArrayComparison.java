import java.util.Scanner;

public class CharArrayComparison {

    // Method to return all characters in a string without using toCharArray()
    public static char[] getCharactersWithoutToCharArray(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter the string: ");
        String str = scanner.next();

        // Get characters using the user-defined method
        char[] charsUsingMethod = getCharactersWithoutToCharArray(str);

        // Get characters using the built-in toCharArray() method
        char[] charsUsingBuiltIn = str.toCharArray();

        // Compare the two character arrays
        boolean areArraysEqual = compareCharArrays(charsUsingMethod, charsUsingBuiltIn);

        // Display the results
        System.out.println("Characters using user-defined method: ");
        for (char c : charsUsingMethod) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters using toCharArray() method: ");
        for (char c : charsUsingBuiltIn) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Are the character arrays equal? " + areArraysEqual);

        scanner.close();
    }
}
