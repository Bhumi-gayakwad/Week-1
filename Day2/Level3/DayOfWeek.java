import java.util.Scanner;

  class DayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Input month, day, and year from the user
        System.out.print("Enter month (1 for January, 2 for February, ...): ");
        int m = scanner.nextInt();
        
        System.out.print("Enter day: ");
        int d = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int y = scanner.nextInt();
        
        // Apply the formula for calculating the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        
        // Print the day of the week
        System.out.println("Day of the week: " + d0);
        
       
    }
}
