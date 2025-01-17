import java.util.Scanner;

  class StudentGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Arrays to store marks, percentages, and grades
        int[][] marks = new int[numberOfStudents][3]; // Marks in physics, chemistry, and maths
        double[] percentages = new double[numberOfStudents]; // Percentages of each student
        String[] grades = new String[numberOfStudents]; // Grades of each student

        // Input marks for each student and calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            // Input for Physics marks
            do {
                System.out.print("Enter marks for Physics for student " + (i + 1) + ": ");
                marks[i][0] = scanner.nextInt();
                if (marks[i][0] < 0) {
                    System.out.println("Marks must be positive. Please try again.");
                }
            } while (marks[i][0] < 0);

            // Input for Chemistry marks
            do {
                System.out.print("Enter marks for Chemistry for student " + (i + 1) + ": ");
                marks[i][1] = scanner.nextInt();
                if (marks[i][1] < 0) {
                    System.out.println("Marks must be positive. Please try again.");
                }
            } while (marks[i][1] < 0);

            // Input for Maths marks
            do {
                System.out.print("Enter marks for Maths for student " + (i + 1) + ": ");
                marks[i][2] = scanner.nextInt();
                if (marks[i][2] < 0) {
                    System.out.println("Marks must be positive. Please try again.");
                }
            } while (marks[i][2] < 0);

            // Calculate percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            // Calculate grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        // Display the marks, percentages, and grades of each student
        System.out.println("\nStudent Report:");
        System.out.println("---------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-8d| %-7d| %-10d| %-6d| %-11.2f| %-6s\n", 
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

    }
}
