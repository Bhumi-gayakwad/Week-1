 import java.util.Scanner;

public class CharArrayComparison {

    // Method to return the characters in a string without using toCharArray()
    public static char[] getCharactersWithoutToCharArray(String str) {
        // Create an array of characters of the same length as the string
        char[] charArray = new char[str.length()];

        // Manually fill the charArray with characters from the string
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        return charArray;
    }

    // Method to compare two char arrays and return a boolean result
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        // If the lengths of the arrays are different, return false
        if (array1.length != array2.length) {
            return false;
        }

        // Compare each character in the arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // If any character does not match, return false
            }
        }

        return true; // If all characters match, return true
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter the string:");
        String str = scanner.next();

        // Get characters using the user-defined method
        char[] userDefinedCharArray = getCharactersWithoutToCharArray(str);

        // Get characters using the built-in toCharArray() method
        char[] builtInCharArray = str.toCharArray();

        // Compare the two char arrays
        boolean result = compareCharArrays(userDefinedCharArray, builtInCharArray);

        // Display the results
        System.out.println("Characters using user-defined method: ");
        for (char c : userDefinedCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters using toCharArray() method: ");
        for (char c : builtInCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Do the two char arrays match? " + result);

         
    }
}
