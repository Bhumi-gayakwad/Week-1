public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String without duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        String result = ""; // This will store the final string without duplicates.

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isDuplicate = false;

            // Check if the current character already exists in the result string.
            for (int j = 0; j < result.length(); j++) {
                if (currentChar == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the result string.
            if (!isDuplicate) {
                result += currentChar;
            }
        }

        return result;
    }
}
