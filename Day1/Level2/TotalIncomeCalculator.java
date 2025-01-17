import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take salary input from the user
        System.out.print("Enter your salary ");
        double salary = scanner.nextDouble();

        // Take bonus input from the user
        System.out.print("Enter your bonus ");
        double bonus = scanner.nextDouble();
		
		// Close the scanner
        scanner.close();

        // Compute total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is  " + salary + " and bonus is  " + bonus + 
                           ". Hence, Total Income is " + totalIncome + ".");
        
        
    }
}
