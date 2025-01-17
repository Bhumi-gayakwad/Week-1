import java.util.Scanner;

  class NumberCheck {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
 
    }
}
