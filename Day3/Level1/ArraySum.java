import java.util.Scanner;

  class ArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store up to 10 double values
        double[] numbers = new double[10];
        
        // Initialize total to 0.0
        double total = 0.0;
        
        // Initialize index variable
        int index = 0;

        // Infinite while loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative number to stop): ");
            double input = scanner.nextDouble();

            // Break the loop if input is 0 or negative, or if array size is reached
            if (input <= 0 || index == 10) {
                break;
            }

            // Store the number in the array and increment index
            numbers[index] = input;
            index++;
        }

        // Calculate the total and display the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers entered and the total sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Total sum: " + total);

        
    }
}
