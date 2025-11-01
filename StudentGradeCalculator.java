import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Student Grade Calculator =====");
        
        // Step 1: Ask how many grades to enter
        System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();

        // Step 2: Create an array to store grades
        double[] grades = new double[numGrades];
        double sum = 0;

        // Step 3: Input each grade using a loop
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }

        // Step 4: Calculate average
        double average = sum / numGrades;

        // Step 5: Display the average
        System.out.printf("The average grade is: %.2f%n", average);

        // Step 6: Optional - Display grade performance
        if (average >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (average >= 75) {
            System.out.println("Grade: B (Good)");
        } else if (average >= 60) {
            System.out.println("Grade: C (Average)");
        } else if (average >= 40) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        scanner.close();
    }
}
