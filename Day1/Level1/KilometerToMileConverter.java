import java.util.Scanner;

 class KilometerToMileConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        //  enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();  // Read the distance in kilometers

        // Conversion factor (1 mile = 1.6 kilometers)
        double miles = km / 1.6;  // Convert kilometers to miles

        // Output the result
        System.out.println("The total miles is " + miles + " mile(s) for the given " + km + " km.");
        
        // Close the Scanner object
        input.close();
    }
}
