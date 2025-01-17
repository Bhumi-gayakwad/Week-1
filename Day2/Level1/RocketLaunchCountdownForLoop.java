import java.util.Scanner;

public class RocketLaunchCountdownForLoop {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the countdown start value from the user
        System.out.print("Enter the starting number for the countdown ");
        int counter = scanner.nextInt();

        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            // Print the current counter value
            System.out.println(i);
        }

        // Print the rocket launch message
        System.out.println("rocket launch");
 
    }
}
