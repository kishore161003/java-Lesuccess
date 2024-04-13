import java.util.Scanner;

class Employee {
    int empId;
    float salary;
}

class empLevel extends Employee {
    int level;

    public empLevel(int empId, float salary) {
        this.empId = empId;
        this.salary = salary;
        if (salary > 100) {
            level = 1;
        } else {
            level = 2;
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        float salary = sc.nextFloat();

        empLevel employee = new empLevel(empId, salary);

        System.out.println(employee.empId);
        System.out.println(employee.salary);
        System.out.println(employee.level);
    }
}