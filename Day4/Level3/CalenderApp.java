import java.util.Scanner;

public class CalendarApp {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "", "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4, but not 100, unless divisible by 400.
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // For February, check if it's a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Using Gregorian calendar algorithm
        if (month < 3) {
            month += 12;
            year--;
        }
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0; // The day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);

        System.out.println("      " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print the indentation for the first day of the month
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("    "); // 4 spaces for each day before the first day
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday (i.e., after printing day 7)
            if ((firstDayOfMonth + day) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println(); // Print a new line after the calendar
    }

    public static void main(String[] args) {
        // Take user input for month and year
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Print the calendar for the given month and year
        printCalendar(month, year);
    }
}
