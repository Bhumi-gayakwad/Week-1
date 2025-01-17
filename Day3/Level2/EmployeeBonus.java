import java.util.Scanner;

  class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define constants
        final int NUM_EMPLOYEES = 10;
        final double BONUS_ABOVE_5_YEARS = 0.05;
        final double BONUS_BELOW_5_YEARS = 0.02;

        // Arrays to store data
        double[] salaries = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonuses = new double[NUM_EMPLOYEES];
        double[] newSalaries = new double[NUM_EMPLOYEES];

        // Variables for totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input data for employees
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();

                if (salary > 0 && years >= 0) { // Validate input
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid input. Salary must be positive and years of service must be non-negative.");
                }
            }
        }

        // Calculate bonuses, new salaries, and totals
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double bonusRate = yearsOfService[i] > 5 ? BONUS_ABOVE_5_YEARS : BONUS_BELOW_5_YEARS;
            bonuses[i] = salaries[i] * bonusRate; // Calculate bonus
            newSalaries[i] = salaries[i] + bonuses[i]; // Calculate new salary

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("\nEmployee Bonus and Salary Details:");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

         
    }
}
