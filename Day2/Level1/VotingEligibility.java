
import java.util.Scanner;

     class VotingEligibility {
    public static void main(String[] args) {
	
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter the person's age ");
        int age = scanner.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        
    }
}
