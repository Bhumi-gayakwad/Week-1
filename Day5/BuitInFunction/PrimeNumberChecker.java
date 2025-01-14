import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Get the number from the user
        int number = getInput("Enter a number to check if it is prime: ");

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(number);

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to get input from the user
    public static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to check if a number is prime
    public static boolean isPrimeNumber(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // It is a prime number
    }
}
