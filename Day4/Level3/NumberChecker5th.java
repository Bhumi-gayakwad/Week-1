public class NumberChecker5th {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatestFactor = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > greatestFactor) {
                greatestFactor = factors[i];
            }
        }
        return greatestFactor;
    }

    // Method to find the sum of the factors using the factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cube of the factors using the factors array
    public static double findProductOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors) - number;  // Exclude the number itself
        return sumOfFactors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors) - number;  // Exclude the number itself
        return sumOfFactors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors) - number;  // Exclude the number itself
        return sumOfFactors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }

    // Helper method to calculate factorial of a number
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // Main method to test the utility methods
    public static void main(String[] args) {
        int number = 28;  // Example number to test

        // Find the factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find the greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor: " + greatestFactor);

        // Find the sum of the factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of factors: " + sumOfFactors);

        // Find the product of the factors
        int productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);

        // Find the product of cubes of the factors
        double productOfCubes = findProductOfCubes(factors);
        System.out.println("Product of cubes of factors: " + productOfCubes);

        // Check if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        // Check if the number is an abundant number
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is not an abundant number.");
        }

        // Check if the number is a deficient number
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a deficient number.");
        } else {
            System.out.println(number + " is not a deficient number.");
        }

        // Check if the number is a strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}
