import java.util.*;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // enter temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Print the result
        System.out.printf("The "+ fahrenheitResult+" fahrenheit is "+celsius+" celsius ");

        // Close the scanner
        sc.close();
    }
}
