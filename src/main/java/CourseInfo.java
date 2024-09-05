import java.util.Scanner;

public class CourseInfo {
    private String courseTitle;
    private String instructor;
    private int enrollment;
    private double studentScores;
    double averageScore;

    public void printInfo() {
        System.out.println("Course title: " + courseTitle);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrollment: " + enrollment);
        System.out.printf("Average student scores: %.2f %n", averageScore);
        System.out.println();
    }

    public void readInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter course title: ");
        courseTitle = keyboard.nextLine( );
        System.out.print("Enter instructor name: ");
        instructor = keyboard.nextLine( );
        System.out.print("Enter enrollment: ");
        enrollment = keyboard.nextInt( );

        System.out.println("Enter Student scores: ");
        for (int i = 0; i < enrollment; i++) {
            System.out.println("Enter a score: ");
            double score = keyboard.nextInt();
            studentScores += score;
        }

        averageScore = studentScores / enrollment;

    }
}
