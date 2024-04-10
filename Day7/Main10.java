package Day7;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID : " + this.id + "\nName : " + this.name + "\nSalary : " + this.salary;
    }
}

class Filter {
    int n;
    int tar;
    ArrayList<Employee> al = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    Filter() {
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Employee emp = new Employee();
            emp.setId(sc.nextInt());
            emp.setName(sc.next());
            emp.setSalary(sc.nextDouble());
            al.add(emp);
        }
    }

    void display() {
        tar = sc.nextInt();
        for (Employee emp : al) {
            if (emp.getSalary() < tar) {
                System.out.println(emp);
            }
        }
    }

}

public class Main10 {
    public static void main(String[] args) {
        Filter f = new Filter();
        f.display();
    }
}
