import java.util.Scanner;

  class VotingEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define an array to hold the ages of 10 students
        int[] ages = new int[10];
        
        // Get input for the age of each student
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        
        // Check voting eligibility for each student
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        
        
    }
}
