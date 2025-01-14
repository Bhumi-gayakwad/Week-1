import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the main string
        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        // Input the substring
        System.out.println("Enter the substring:");
        String substring = scanner.nextLine();

        // Count occurrences
        int count = countSubstringOccurrences(mainString, substring);

        // Output the result
        System.out.println("The substring \"" + substring + "\" occurs " + count + " time(s) in the main string.");
    }

    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        // Check for occurrences of the substring in the main string
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move the index forward to avoid overlapping matches
        }

        return count;
    }
}
