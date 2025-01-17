import java.util.Scanner;

  class PrimeNumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize the isPrime variable to true (assuming the number is prime)
        boolean isPrime = true;
        
        // Check if the number is greater than 1
        if (number > 1) {
            // Loop from 2 to the number-1
            for (int i = 2; i <= number / 2; i++) {
                // If the number is divisible by any number other than 1 and itself
                if (number % i == 0) {
                    isPrime = false;  // Set isPrime to false
                    break;  // Exit the loop as the number is not prime
                }
            }
        } else {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
 
    }
}
