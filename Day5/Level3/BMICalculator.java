import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] heightWeightData) {
        String[][] bmiStatusArray = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = heightWeightData[i][0];
            double heightInCm = heightWeightData[i][1];
            double heightInMeters = heightInCm / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            bmiStatusArray[i][0] = String.format("%.2f", heightInCm); // Height
            bmiStatusArray[i][1] = String.format("%.2f", weight);     // Weight
            bmiStatusArray[i][2] = String.format("%.2f", bmi);        // BMI
            bmiStatusArray[i][3] = status;                            // Status
        }

        return bmiStatusArray;
    }

    // Method to display the BMI data in tabular format
    public static void displayBMIData(String[][] bmiData) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", 
                bmiData[i][0], 
                bmiData[i][1], 
                bmiData[i][2], 
                bmiData[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeightData = new double[10][2];

        // Input height and weight for 10 persons
        System.out.println("Enter the height (in cm) and weight (in kg) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Height (cm): ", i + 1);
            heightWeightData[i][1] = scanner.nextDouble();

            System.out.printf("Person %d - Weight (kg): ", i + 1);
            heightWeightData[i][0] = scanner.nextDouble();
        }

        // Calculate BMI and Status
        String[][] bmiData = calculateBMI(heightWeightData);

        // Display BMI data
        System.out.println("\nBMI Data:");
        displayBMIData(bmiData);

        scanner.close();
    }
}
