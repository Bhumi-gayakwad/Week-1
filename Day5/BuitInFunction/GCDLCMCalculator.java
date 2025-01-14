import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        // Get two numbers from the user
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        
        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        
        // Display the results
        displayResults(gcd, lcm);
    }

    // Function to get input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to calculate the Greatest Common Divisor (GCD) using the Euclidean algorithm
    public static int calculateGCD(int num1, int num2) {
        // Euclidean algorithm for GCD
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1; // GCD is found when num2 becomes 0
    }

    // Function to calculate the Least Common Multiple (LCM)
    public static int calculateLCM(int num1, int num2, int gcd) {
        // LCM formula: LCM(a, b) = |a * b| / GCD(a, b)
        return Math.abs(num1 * num2) / gcd;
    }

    // Function to display the results
    public static void displayResults(int gcd, int lcm) {
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);
    }
}
