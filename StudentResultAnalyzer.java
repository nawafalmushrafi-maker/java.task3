package idea.project.java.task3;
import java.util.Scanner;
public class StudentResultAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String studentName;
        int subject1Mark;
        int subject2Mark;
        int subject3Mark;
        int subject4Mark;

        int totalMarks;
        double averageMark;
        String finalGrade;
        String performanceStatus;

        IO.println("Enter Student Name: ");
        studentName = input.nextLine();

        IO.println("Enter Subject 1 Mark: ");
        subject1Mark = input.nextInt();

        IO.println("Enter Subject 2 Mark: ");
        subject2Mark = input.nextInt();

        IO.println("Enter Subject 3 Mark: ");
        subject3Mark = input.nextInt();

        IO.println("Enter Subject 4 Mark: ");
        subject4Mark = input.nextInt();

        if (validateMarks(subject1Mark, subject2Mark, subject3Mark, subject4Mark))
        {
            totalMarks = calculateTotal(subject1Mark, subject2Mark, subject3Mark, subject4Mark);

            averageMark = calculateAverage(totalMarks, 4);

            finalGrade = calculateGrade(averageMark);

            performanceStatus = checkPerformance(finalGrade);

            displayReport(studentName, subject1Mark, subject2Mark, subject3Mark, subject4Mark,
                    totalMarks, averageMark, finalGrade, performanceStatus);
        }
        else {
            IO.println("Invalid marks. Please check the student grades.");
        }
        input.close();
    }

    public static boolean validateMarks(int mark1, int mark2, int mark3, int mark4) {
        return mark1 >= 0 && mark1 <= 100 && mark2 >= 0 && mark2 <= 100 && mark3 >= 0 && mark3 <= 100 && mark4 >= 0 && mark4 <= 100;
    }
    public static int calculateTotal(int mark1, int mark2, int mark3, int mark4) {
        return mark1 + mark2 + mark3 + mark4;
    }
    public static double calculateAverage(int totalMarks, int numberOfSubjects) {
        return (double) totalMarks / numberOfSubjects;
    }
    public static String calculateGrade(double averageMark) {
        if (averageMark >= 90) {
            return "A";
        } else if (averageMark >= 80) {
            return "B";
        } else if (averageMark >= 70) {
            return "C";
        } else if (averageMark >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    public static String checkPerformance(String grade) {
        if (grade.equals("A")) {
            return "Excellent";
        } else if (grade.equals("B")) {
            return "Very Good";
        } else if (grade.equals("C")) {
            return "Good";
        } else if (grade.equals("D")) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    public static void displayReport(String studentName, int subject1Mark, int subject2Mark, int subject3Mark, int subject4Mark, int totalMarks, double averageMark, String finalGrade, String performanceStatus) {
        System.out.println("===== Student Result Report =====");
        System.out.println("Student Name: " + studentName);
        System.out.println("Subject 1 Mark: " + subject1Mark);
        System.out.println("Subject 2 Mark: " + subject2Mark);
        System.out.println("Subject 3 Mark: " + subject3Mark);
        System.out.println("Subject 4 Mark: " + subject4Mark);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Mark: " + averageMark);
        System.out.println("Final Grade: " + finalGrade);
        System.out.println("Performance Status: " + performanceStatus);
    }
}


