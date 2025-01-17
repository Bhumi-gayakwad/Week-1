class AverageMarkCalculator {
    public static void main(String[] args) {
        // Marks in each subject
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;

        // Total marks in PCM (out of 300)
        int totalMarks = mathsMark + physicsMark + chemistryMark;

        // Calculate the average percentage mark
        double averageMark = totalMarks / 3.0;

        // Display the result
        System.out.println("Sam's average mark in PCM is " + averageMark);
    }
}
