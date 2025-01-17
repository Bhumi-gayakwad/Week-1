import java.util.Scanner;

    class HandshakeCalculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take the number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes using the combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);

         
    }
}
