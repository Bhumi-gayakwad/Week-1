import java.util.Scanner;

public class HandshakesCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Check if the number of students is valid
        if (numberOfStudents < 2) {
            System.out.println("There must be at least 2 students for a handshake.");
        } else {
            // Calculate the maximum number of handshakes
            int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Display the result
            System.out.println("The maximum number of handshakes is: " + maxHandshakes);
        }

         
    }
}
