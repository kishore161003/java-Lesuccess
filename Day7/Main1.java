package Day7;

import java.util.Arrays;

class Employee {
    private int empNo;
    private String name;
    private double salary;
    private byte age;

    Employee(int empNo, String name, double salary, byte age) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    Employee() {
    }

    void set(int empNo, String name, double salary, byte age) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    int getEmpNo() {
        return empNo;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    byte getAge() {
        return age;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee emp = new Employee();

    }
}