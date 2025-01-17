import java.util.Scanner;

 class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop through 6 to 9 to print the multiplication table
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

         
    }
}
