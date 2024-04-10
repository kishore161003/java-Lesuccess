package Day7;

import java.util.Scanner;

class Question5 {
    static Scanner sc = new Scanner(System.in);

    static int count(int n) {
        return (int) Math.log10(n) + 1;
    }

    public static void main() {
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}

public class Main6 {
    public static void main(String[] args) {
        Question5 q1 = new Question5();
        q1.main();
    }
}
