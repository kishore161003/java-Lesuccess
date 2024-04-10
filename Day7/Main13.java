package Day7;

import java.util.ArrayList;
import java.util.Scanner;

class BusBooking {
    String name;
    int age;
    char gender;

    public String toString() {
        return this.name + " " + this.age + " " + this.gender;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main13 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<BusBooking> bb;
        int n = sc.nextInt();
        bb = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            BusBooking b = new BusBooking();
            b.setName(sc.next());
            b.setAge(sc.nextInt());
            b.setGender(sc.next().charAt(0));
            bb.add(b);
        }
        boolean flag = true;
        String tar = sc.next();
        for (int i = 0; i < n; i++) {
            if (bb.get(i).getName().equals(tar)) {
                bb.remove(i);
                flag = false;
                break;

            }
        }
        if (flag != true) {
            System.out.println("User Details deleted");
            for (BusBooking b : bb) {
                System.out.println(b);
            }
        } else {
            System.out.println("No user matched");
        }

    }

}
