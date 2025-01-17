import java.util.Scanner;

  class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take salary input from the user
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        // Take years of service input from the user
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if years of service is more than 5
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            double bonus = 0.05 * salary;
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service.");
        }

       
    }
}
