import java.util.Scanner;

public class DiscountCalculatorUsingInput{
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take fee input from user
        System.out.print("Enter the fee: ");
        double fee = scanner.nextDouble();

        // Take discount percentage input from user
        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Close the scanner object
        scanner.close(); 
		
        // Compute the discount amount
        double discount = (fee * discountPercent) / 100;

        // Compute the final fee after discount
        double finalFee = fee - discount;

        // Output the discount amount and final fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
       
    }
}
