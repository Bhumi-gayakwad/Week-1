import java.util.Scanner;

  class MultiplicationTableUsingArray {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Get an integer input from the user
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        
        // Define an integer array  
        int[] multiplicationTable = new int[10];
        
        // Loop from 1 to 10 to calculate the multiplication results
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i; // Store the result in the array
        }
        
        // Display the multiplication table
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
         
    }
}
