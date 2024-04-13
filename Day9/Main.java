import java.util.Scanner;

class Employee {
    String eName;
    int eId;
    int eSalary;
    static String companyName = "ABC Corp";

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public int geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }

    public int geteSalary() {
        return eSalary;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int id = scanner.nextInt();
            int salary = scanner.nextInt();

            employees[i] = new Employee();
            employees[i].seteName(name);
            employees[i].seteId(id);
            employees[i].seteSalary(salary);
        }
        String companyName = scanner.next();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee Name: " + employees[i].geteName());
            System.out.println("Employee ID: " + employees[i].geteId());
            System.out.println("Employee Salary: " + employees[i].geteSalary());
            System.out.println("Employee Company Name: " + Employee.getCompanyName());
        }

        Employee.setCompanyName(companyName);

        System.out.println("Updated  details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee Name: " + employees[i].geteName());
            System.out.println("Employee ID: " + employees[i].geteId());
            System.out.println("Employee Salary: " + employees[i].geteSalary());
            System.out.println("Employee Company Name: " + Employee.getCompanyName());
        }
        scanner.close();
    }
}
