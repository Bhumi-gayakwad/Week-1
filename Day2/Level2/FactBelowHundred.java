import java.util.Scanner;

  class FactBelowHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input for the number
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = scanner.nextInt();
        
        System.out.println("Multiples of " + number + " below 100 are:");
        
        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        
         
    }
}
