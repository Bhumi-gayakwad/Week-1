import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input for the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Take input for the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt(); 
		
		// Close the scanner
        scanner.close();

        // Print the numbers before swapping
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped numbers
        System.out.println("The swapped numbers are "+ number1 +"  and  "+ number2 );


        
    }
}
