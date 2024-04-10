package Day7;

import java.util.Scanner;

class Person {
    String name;
    int phone;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }
}

class Implementation {
    int n;
    Person[] p;
    Scanner sc = new Scanner(System.in);
    String tar;

    void getInput() {
        n = sc.nextInt();
        p = new Person[n];
        for (int i = 0; i < n; i++) {
            p[i].setName(sc.next());
            p[i].setPhone(sc.nextInt());

        }
    }

    void search() {
        tar = sc.next();
        for (int i = 0; i < n; i++) {
            if (p[i].getName().startsWith(tar)) {
                System.out.println(p[i].getName() + " " + p[i].getPhone());
            }
        }
    }
}

public class Main5 {
    public static void main(String[] args) {

        Implementation imp = new Implementation();
        imp.getInput();
        imp.search();
    }

}
