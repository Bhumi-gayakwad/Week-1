 class PenDistributor {
    public static void main(String[] args) {
        // Given values for total pens and students
        int totalPens = 14;
        int totalStudents = 3;

        // Calculate how many pens each student will get
        int pensPerStudent = totalPens / totalStudents;

        // Calculate the remaining pens (not distributed)
        int remainingPens = totalPens % totalStudents;

        // Display the results
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
