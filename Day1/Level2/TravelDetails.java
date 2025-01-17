import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take inputs for traveler details and locations
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city you are passing through (via): ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();

        // Take inputs for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        // Take input for time taken
        System.out.print("Enter the total time taken for the journey in hours: ");
        double timeTaken = scanner.nextDouble();

        // Calculate total distance and average speed
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        // Take input for fee and discount percentage
        System.out.print("Enter the total fee ");
        double fee = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Print results
        System.out.println("--- Travel Details ---");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " miles/hour");
        System.out.println("\n--- Fee Details ---");
        System.out.println("Total Fee: INR " + fee);
        System.out.println("Discount: INR " + discount);
        System.out.println("Final Fee: INR " + finalFee);

        //  operator precedence
        int a = 10, b = 5, c = 2;
        int result1 = a + b * c; // Multiplication has higher precedence than addition
        int result2 = (a + b) * c; // Parentheses change the precedence
        int result3 = a * b / c; // Multiplication and division are left-to-right associative

        System.out.println("--- Operator Precedence Results ---");
        System.out.println("Result of a + b * c: " + result1);
        System.out.println("Result of (a + b) * c: " + result2);
        System.out.println("Result of a * b / c: " + result3);

        // Close the scanner
        scanner.close();
    }
}
