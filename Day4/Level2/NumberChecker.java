import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 > number2
        } else if (number1 == number2) {
            return 0; // number1 == number2
        } else {
            return -1; // number1 < number2
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Input numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Check each number for positive/negative and even/odd
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is positive");
                if (isEven(number)) {
                    System.out.println(" and even.");
                } else {
                    System.out.println(" and odd.");
                }
            } else {
                System.out.println(number + " is negative.");
            }
        }

        // Compare the first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of the first and last elements: ");
        if (result == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (result == 0) {
            System.out.println("First element is equal to the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }

         
    }
}
