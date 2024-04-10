package Day2;
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks obtained in Physics: ");
        int physicsMarks = scanner.nextInt();

        System.out.print("Enter the marks obtained in Chemistry: ");
        int chemistryMarks = scanner.nextInt();

        System.out.print("Enter the marks obtained in Math: ");
        int mathMarks = scanner.nextInt();

        System.out.print("Enter the marks obtained in Biology: ");
        int biologyMarks = scanner.nextInt();

        System.out.print("Enter the marks obtained in Computer: ");
        int computerMarks = scanner.nextInt();

        int totalMarks = physicsMarks + chemistryMarks + mathMarks + biologyMarks + computerMarks;
        double percentage = (totalMarks / 500.0) * 100;

        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }
}
