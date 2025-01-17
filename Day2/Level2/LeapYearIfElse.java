import java.util.Scanner;

 class LeapYearIfElse {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Input year from the user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Ensure the year is >= 1582 (Gregorian calendar year)
        if (year >= 1582) {
            // Single if statement with logical && and || operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be 1582 or later.");
        }
         
    }
}
