import java.util.Scanner;

  class HeightConverter {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take height in centimeters as input
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();

        // Convert height to inches (1 inch = 2.54 cm)
        double heightInInches = heightInCm / 2.54;

        // Convert height to feet and inches
        int feet = (int) (heightInInches / 12); // 1 foot = 12 inches
        int inches = (int) (heightInInches % 12); // Remaining inches

        // Output the results
        System.out.println("Your height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);

    }
}
