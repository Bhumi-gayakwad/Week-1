import java.util.Scanner;

 class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the countdown start value from the user
        System.out.print("Enter the starting number for the countdown: ");
        int counter = scanner.nextInt();

        // Countdown using a while loop
        while (counter >= 1) {
            // Print the current counter value
            System.out.println(counter);

            // Decrement the counter
            counter--;
        }

        // Print the rocket launch message
        System.out.println("Rocket Launch");
 
    }
}
