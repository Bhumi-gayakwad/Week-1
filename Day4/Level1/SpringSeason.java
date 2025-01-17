 import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the month (1 for January, 2 for February, etc.): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        // Check if it's spring season
        boolean isSpring = isSpringSeason(month, day);

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
 
    }

    // Method to check if the given date is in the spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check for Spring Season from March 20 to June 20
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 to March 31
            (month == 4 && day >= 1 && day <= 30) ||  // April
            (month == 5 && day >= 1 && day <= 31) ||  // May
            (month == 6 && day >= 1 && day <= 20)) {  // June 1 to June 20
            return true;
        } else {
            return false;
        }
    }
}
