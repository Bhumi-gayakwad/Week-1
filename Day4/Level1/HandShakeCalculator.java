import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum number of handshakes  
    public static int calculateHandshakes(int n) {
        // Formula to calculate combinations: C(n, 2) = n * (n - 1) / 2
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Check if the input is valid (should be greater than 1)
        if (n <= 1) {
            System.out.println("The number of students should be greater than 1.");
        } else {
            // Calculate the number of handshakes using the combination method
            int handshakes = calculateHandshakes(n);

            // Display the result
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
        }

 
    }
}
