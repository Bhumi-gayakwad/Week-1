import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Get user choice for conversion
        int choice = getConversionChoice();
        
        // Get temperature input from the user
        double temperature = getInput("Enter the temperature: ");
        
        // Perform the conversion based on user's choice
        if (choice == 1) {
            // Convert Fahrenheit to Celsius
            double celsius = fahrenheitToCelsius(temperature);
            displayResult(temperature, celsius, "Fahrenheit", "Celsius");
        } else if (choice == 2) {
            // Convert Celsius to Fahrenheit
            double fahrenheit = celsiusToFahrenheit(temperature);
            displayResult(temperature, fahrenheit, "Celsius", "Fahrenheit");
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }
    }

    // Function to get conversion choice from the user
    public static int getConversionChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        return scanner.nextInt();
    }

    // Function to get the temperature input from the user
    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to display the conversion result
    public static void displayResult(double originalTemp, double convertedTemp, String originalUnit, String convertedUnit) {
        System.out.println(originalTemp + " " + originalUnit + " is equal to " + convertedTemp + " " + convertedUnit + ".");
    }
}
