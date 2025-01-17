import java.util.Scanner;

  class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number (positive integer greater than 0).");
        } else {
            // Iterate from 1 to the number
            System.out.println("Odd and Even numbers between 1 and " + number + ":");
            for (int i = 1; i <= number; i++) {
                // Check if the number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number.");
                } else {
                    System.out.println(i + " is an Odd number.");
                }
            }
        }
		
    }
}
