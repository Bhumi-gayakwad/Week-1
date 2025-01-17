import java.util.Scanner;

  class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        // Create arrays to store weight, height, BMI, and weight status
        double[] weight = new double[numPersons];
        double[] height = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];

        // Take input for the weight and height of each person
        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            height[i] = scanner.nextDouble();

            // Calculate BMI and store it
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine the weight status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nBMI Report:");
        System.out.println("---------------------------------------------------");
        System.out.println("Person | Height (m) | Weight (kg) | BMI   | Weight Status");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-7d| %-12.2f| %-12.2f| %-6.2f| %-15s\n", 
                    i + 1, height[i], weight[i], bmi[i], status[i]);
        }

        
    }
}
