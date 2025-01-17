import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate the BMI column in the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // BMI formula
        }
    }

    // Method to determine BMI status based on BMI value
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store weight, height, and BMI
        double[][] data = new double[10][3];

        // Input weight and height for 10 members
        System.out.println("Enter weight (in kg) and height (in cm) for 10 members:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Member " + (i + 1) + " Weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Member " + (i + 1) + " Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Determine BMI status
        String[] statuses = determineBMIStatus(data);

        // Display results
        System.out.println("\nMember Details (Weight, Height, BMI, Status):");
        for (int i = 0; i < data.length; i++) {
            System.out.printf(
                "Member %d: Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s%n",
                i + 1, data[i][0], data[i][1], data[i][2], statuses[i]
            );
        }

         
    }
}
