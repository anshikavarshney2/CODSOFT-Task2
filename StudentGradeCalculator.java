import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of subjects:");
        int numberOfSub= sc.nextInt();

        int[] marks = new int[numberOfSub];
        System.out.println("Enter the marks obtained in each subject (out of 100):");
        for (int i = 0; i < numberOfSub; i++) {
            marks[i] = sc.nextInt();
        }

    
        int totalMarks = calculateTotalMarks(marks);

        
        double averagePercentage = calculateAveragePercentage(totalMarks, numberOfSub);

        
        char grade = calculateGrade(averagePercentage);


        displayResults(totalMarks, averagePercentage, grade);
        
        sc.close();
    }

    public static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static double calculateAveragePercentage(int totalMarks, int numberOfSub) {
        return (double) totalMarks / numberOfSub;
    }

    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}