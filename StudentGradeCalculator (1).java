import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        double avgPercentage = (double) totalMarks / numSubjects;

        char grade = calculateGrade(avgPercentage);

        System.out.println("\nTotal Marks : " + numSubjects*100);
        System.out.println("Marks Scored: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static char calculateGrade(double avgPercentage) {
        if (avgPercentage >= 90) {
            return 'A';
        } else if (avgPercentage >= 80) {
            return 'B';
        } else if (avgPercentage >= 70) {
            return 'C';
        } else if (avgPercentage >= 60) {
            return 'D';
        } else if (avgPercentage >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
