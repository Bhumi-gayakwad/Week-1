import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Get the operation choice from the user
        int choice = getOperationChoice();
        
        // Get two numbers from the user
        double num1 = getInput("Enter the first number: ");
        double num2 = getInput("Enter the second number: ");
        
        // Perform the chosen operation
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        
        // Display the result
        displayResult(result);
    }

    // Function to get operation choice from the user
    public
