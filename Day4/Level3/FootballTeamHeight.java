import java.util.Random;

public class FootballTeamHeight {

    // Method to generate random heights for 11 players
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();

        // Generate random heights between 150 and 250 cm for each player
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101);  // Random height between 150 and 250
        }
        return heights;
    }

    // Method to find the sum of all elements in the heights array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Generate random heights for 11 players
        int[] heights = generateHeights(11);

        // Display the heights of the players
        System.out.print("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Find the sum, mean, shortest, and tallest heights
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display the results
        System.out.println("Sum of all heights: " + sum + " cm");
        System.out.printf("Mean height: %.2f cm%n", mean);
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
    }
}
