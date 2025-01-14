import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Start the game
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        System.out.println("Respond with 'higher' if my guess is too low, 'lower' if it's too high, or 'correct' if I guess your number.");

        // Call the guessing function
        int guess = 0;
        int lowerBound = 1;
        int upperBound = 100;
        String feedback = "";

        while (!feedback.equals("correct")) {
            // Generate a guess
            guess = generateGuess(lowerBound, upperBound);
            System.out.println("Is your number " + guess + "?");
            feedback = getUserFeedback(scanner);

            // Adjust bounds based on user feedback
            if (feedback.equals("higher")) {
                lowerBound = guess + 1;
            } else if (feedback.equals("lower")) {
                upperBound = guess - 1;
            }
        }

        System.out.println("I guessed your number correctly!");
    }

    // Function to generate a random guess between the current bounds
    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // Function to get feedback from the user
    public static String getUserFeedback(Scanner scanner) {
        System.out.println("Enter feedback (higher, lower, or correct):");
        return scanner.nextLine().toLowerCase();
    }
}
