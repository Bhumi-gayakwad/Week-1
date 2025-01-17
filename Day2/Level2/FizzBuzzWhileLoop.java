import java.util.Scanner;

  class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Input a number from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number > 0) {
            // Initialize a counter variable for the while loop
            int i = 0;
            
            // Run the while loop until i reaches the given number
            while (i <= number) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // If none of the above, print the number itself
                else {
                    System.out.println(i);
                }
                // Increment the counter
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        
    }
}
