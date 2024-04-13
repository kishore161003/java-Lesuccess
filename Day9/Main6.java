import java.util.Scanner;

class Hello {
    void sayHello() {
        System.out.println("Hello");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hello h = new Hello();
        String name = sc.next();
        h.sayHello();
        h.sayHello(name);
    }

}
