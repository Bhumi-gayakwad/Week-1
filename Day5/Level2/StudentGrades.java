 import java.util.Random;

public class StudentGrades {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = rand.nextInt(100); // Physics score
            scores[i][1] = rand.nextInt(100); // Chemistry score
            scores[i][2] = rand.nextInt(100); // Math score
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4]; // [total, average, percentage]

        for (int i = 0; i < numStudents; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            // Storing total, average, and percentage rounded to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to calculate grades based on the percentage
    public static String[][] calculateGrades(double[][] results, int numStudents) {
        String[][] grades = new String[numStudents][1];

        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 90) {
                grades[i][0] = "A+";
            } else if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B+";
            } else if (percentage >= 60) {
                grades[i][0] = "B";
            } else if (percentage >= 50) {
                grades[i][0] = "C";
            } else {
                grades[i][0] = "F";
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades, int numStudents) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t\t");
            System.out.print(results[i][2] + "\t\t");
            System.out.println(grades[i][0]);
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Number of students
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateTotalAveragePercentage(scores, numStudents);
        String[][] grades = calculateGrades(results, numStudents);
        displayScorecard(scores, results, grades, numStudents);
    }
}
