import java.util.Scanner;

  class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize sum variable
        int sum = 0;
        
        // Run a for loop to check the divisors of the number
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of the number
            if (number % i == 0) {
                sum += i; // Add the divisor to sum
            }
        }
        
        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
        
         
    }
}
