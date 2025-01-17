import java.util.Scanner; 

  class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Input the number and power from the user
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        
        // Initialize the result variable to 1
        int result = 1;
        
        // Loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply the result by the number in each iteration
        }
        
        // Output the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        
       
    }
}
