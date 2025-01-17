import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take the unit price and quantity as input
        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " 
                + quantity + " and the unit price is INR " + unitPrice);

         
    }
}
