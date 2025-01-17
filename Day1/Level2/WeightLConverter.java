import java.util.Scanner;

 class WeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Convert weight to kilograms (1 pound = 2.2 kg)
        double weightInKilograms = weightInPounds / 2.2;

        // Display the result
        System.out.println("The weight of the person in pounds is " + weightInPounds +
                           " and in kilograms is " + weightInKilograms);

        // Close the scanner
        scanner.close();
    }
}
