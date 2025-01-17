import java.util.Random;
import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate random ages for n students
    public static int[] generateAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(81) - 20; // Random age between -20 and 60
        }

        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayVotingTable(String[][] data) {
        System.out.printf("%-10s %-15s\n", "Age", "Voting Eligibility");
        System.out.println("-----------------------------");

        for (String[] row : data) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate random ages for students
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingData = checkVotingEligibility(ages);

        // Display the results
        displayVotingTable(votingData);

        scanner.close();
    }
}
