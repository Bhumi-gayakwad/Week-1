import java.util.Scanner;

 class FactorOfNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Part 1: Find the factors of a number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Part 2: Find all multiples of a number below 100
        System.out.print("\nEnter a number to find its multiples below 100: ");
        int multipleOf = scanner.nextInt();
        
        System.out.println("Multiples of " + multipleOf + " below 100 are:");
        for (int i = multipleOf; i < 100; i += multipleOf) {
            System.out.println(i);
        }
        
        
    }
}
