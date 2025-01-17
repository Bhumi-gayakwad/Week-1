import java.util.Scanner;

  class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Input the number from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Initialize the greatestFactor variable
        int greatestFactor = 1;
        
        // Loop from number-1 to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                greatestFactor = i; // Assign i to greatestFactor
                break; // Break the loop after finding the greatest factor
            }
        }
        
        // Output the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
 
    }
}
