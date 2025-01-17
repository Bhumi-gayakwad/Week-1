import java.util.Scanner;

  class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables for marks
        double physics, chemistry, maths;
        
        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        physics = scanner.nextDouble();
        
        System.out.print("Enter marks for Chemistry: ");
        chemistry = scanner.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        maths = scanner.nextDouble();
        
        // Calculate total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;
        
        // Compute the grade and remarks based on the percentage
        String grade;
        String remarks;
        
        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B+";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Average";
        } else if (percentage >= 50) {
            grade = "C";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        
        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks + "/300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        
    }
}
