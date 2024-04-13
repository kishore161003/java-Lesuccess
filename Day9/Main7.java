class Main {
    void print(int a) {
        System.out.println(a);
    }

    void print(String st) {
        System.out.println(st);
    }

    void print(double t) {
        System.out.println(t);
    }
}

public class Main7 {
    public static void main(String[] args) {
        Main m = new Main();
        m.print(35);
        m.print("Hello World");
        m.print(24.35);
    }

}
