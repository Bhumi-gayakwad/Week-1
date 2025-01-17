import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    // Method to calculate Euclidean distance between two points (x1, y1) and (x2, y2)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Formula for Euclidean distance
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate the equation of the line given two points (x1, y1) and (x2, y2)
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate slope (m)
        double slope = (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept (b)
        double yIntercept = y1 - slope * x1;
        
        // Return both slope and y-intercept as an array
        return new double[] { slope, yIntercept };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the coordinates of the two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        // Calculate Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        
        // Calculate line equation
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        
        // Output the equation of the line
        System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
        
        
    }
}
