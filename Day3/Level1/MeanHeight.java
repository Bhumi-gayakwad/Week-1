 import java.util.Scanner;

 class MeanHeight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store the heights of 11 players
        double[] heights = new double[11];

        // Variable to store the sum of all heights
        double sum = 0.0;

        // Get input values for the heights
        System.out.println("Enter the heights of 11 football players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Add the height to the sum
        }

        // Calculate the mean height
        double mean = sum / 11;

        // Display the mean height
        System.out.printf("The mean height of the football team is: %.2f cm%n", mean);

         
    }
}
