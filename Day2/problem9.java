package Day2;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        
        double hra, da;
        if (basicSalary <= 10000) {
            hra = 0.2 * basicSalary;
            da = 0.8 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.9 * basicSalary;
        } else {
            hra = 0.3 * basicSalary;
            da = 0.95 * basicSalary;
        }
        
        double grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary: " + grossSalary);
        
        scanner.close();
    }
}
