import java.util.Scanner;

class Parent {
    void m1() {
        System.out.println("From Parent m1");
    }

    void m2(int a) {
        System.out.println(a);
    }
}

class Child extends Parent {
    void m1() {
        System.out.println("From child m1");
    }

    void m2(int a) {
        System.out.println(a);
    }

}

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        Parent P = new Parent();
        P.m1();
        P.m2(f);
        P = new Child();
        P.m1();
        P.m2(s);
    }

}
