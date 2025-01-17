import java.util.Random;

public class ZaraBonus {

    // Method to generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData(int size) {
        Random random = new Random();
        double[][] employeeData = new double[size][2]; // 0th column for salary, 1st column for years of service

        for (int i = 0; i < size; i++) {
            // Generate a random salary between 30000 to 99999 (5-digit salary)
            employeeData[i][0] = 30000 + (random.nextDouble() * 70000); 
            // Generate years of service between 1 and 20
            employeeData[i][1] = 1 + (random.nextInt(20)); 
        }

        return employeeData;
    }

    // Method to calculate the new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] newEmployeeData = new double[employeeData.length][3]; // 0th column for old salary, 1st column for years of service, 2nd column for new salary & bonus

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0.0;

            // Determine the bonus percentage based on years of service
            if (yearsOfService > 5) {
                bonus = 0.05 * oldSalary; // 5% bonus
            } else {
                bonus = 0.02 * oldSalary; // 2% bonus
            }

            // Calculate new salary after adding the bonus
            double newSalary = oldSalary + bonus;

            // Save old salary, years of service, and new salary with bonus in the new array
            newEmployeeData[i][0] = oldSalary;
            newEmployeeData[i][1] = yearsOfService;
            newEmployeeData[i][2] = newSalary;
        }

        return newEmployeeData;
    }

    // Method to calculate the total sum of old salary, new salary and total bonus
    public static void calculateAndDisplayTotals(double[][] employeeData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += employeeData[i][0];
            totalBonus += employeeData[i][2] - employeeData[i][0]; // New salary minus old salary gives the bonus
            totalNewSalary += employeeData[i][2];
        }

        // Display the results in tabular format
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-15s%-20s%-20s%-20s\n", "Employee", "Old Salary", "New Salary", "Bonus");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("Employee %d%-5d%-20.2f%-20.2f%-20.2f\n", i + 1, employeeData[i][0], employeeData[i][2], employeeData[i][2] - employeeData[i][0]);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-15s%-20s%-20s%-20s\n", "Total", totalOldSalary, totalNewSalary, totalBonus);
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData(numEmployees);

        // Calculate new salary and bonus
        double[][] updatedEmployeeData = calculateNewSalaryAndBonus(employeeData);

        // Calculate and display totals
        calculateAndDisplayTotals(updatedEmployeeData);
    }
}
