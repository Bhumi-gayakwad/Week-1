import java.util.Scanner;

  class BMICalculatorTwoD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[number][3]; // personData[i][0] = weight, personData[i][1] = height, personData[i][2] = BMI
        String[] weightStatus = new String[number]; // Array to store weight status of each person

        // Take input for weight and height of each person
        for (int i = 0; i < number; i++) {
            // Input for weight (ensure positive value)
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Weight must be positive. Please try again.");
                }
            } while (personData[i][0] <= 0);

            // Input for height (ensure positive value)
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Height must be positive. Please try again.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI and store it in the array
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nBMI Report:");
        System.out.println("---------------------------------------------------");
        System.out.println("Person | Height (m) | Weight (kg) | BMI   | Weight Status");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-7d| %-12.2f| %-12.2f| %-6.2f| %-15s\n", 
                    i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }

        
    }
}
