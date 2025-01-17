import java.util.Random;

public class StudentScores {

    // Method to generate random scores for Physics, Chemistry, and Maths for each student
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 columns for PCM

        // Generate random 2-digit scores for each subject (Physics, Chemistry, and Maths)
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(100); // Physics score
            scores[i][1] = rand.nextInt(100); // Chemistry score
            scores[i][2] = rand.nextInt(100); // Maths score
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // 4 columns for total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Rounding values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage
        }

        return results;
    }

    // Method to display the scorecard for all students
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d\t", i + 1);
            System.out.printf("%d\t%d\t%d\t", scores[i][0], scores[i][1], scores[i][2]);
            System.out.printf("%.2f\t%.2f\t%.2f\n", results[i][0], results[i][1], results[i][2]);
        }

        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Get number of students from the user (or hardcode for simplicity)
        int numStudents = 5; // Example: 5 students

        // Step 1: Generate random scores for the students
        int[][] scores = generateScores(numStudents);

        // Step 2: Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);

        // Step 3: Display the scorecard
        displayScorecard(scores, results);
    }
}
