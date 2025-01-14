import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String input = scanner.nextLine();

        // Input the character to remove
        System.out.println("Enter the character to remove:");
        char charToRemove = scanner.next().charAt(0);

        // Remove the character
        String modifiedString = removeCharacter(input, charToRemove);

        // Output the result
        System.out.println("Modified String: " + modifiedString);
    }

    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Append the character if it is not the one to remove
            if (ch != charToRemove) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
