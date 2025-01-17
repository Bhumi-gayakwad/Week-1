import java.util.Scanner;

  class BMI {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Input weight in kilograms and height in centimeters
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height (in cm): ");
        double heightCm = scanner.nextDouble();
        
        // Convert height from centimeters to meters
        double heightM = heightCm / 100;
        
        // Calculate BMI
        double bmi = weight / (heightM * heightM);
        
        // Determine weight status based on BMI
        String weightStatus;
        
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            weightStatus = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obesity";
        }
        
        // Output the BMI and weight status
        System.out.println("\n--- BMI Report ---");
        System.out.println("Your BMI: " + bmi);
        System.out.println("Weight Status: " + weightStatus);
        
         
    }
}
