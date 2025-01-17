import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for Principal
        System.out.print("Enter the Principal amount ");
        double principal = scanner.nextDouble();

        // Take input for Rate of Interest
        System.out.print("Enter the Rate of Interest ");
        double rate = scanner.nextDouble();

        // Take input for Time
        System.out.print("Enter the Time");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + "%, and Time " + time + " years.");

        // Close the scanner
        scanner.close();
    }
}
