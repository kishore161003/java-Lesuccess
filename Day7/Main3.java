package Day7;

import java.util.Scanner;

public class Main3 {
    static Scanner sc = new Scanner(System.in);

    public void alph(Character ch) {
        if ("aeiouAEIOU".contains("" + ch)) {
            System.out.println(ch + " :Vowels ");
        } else {
            System.out.println(ch + " :Vowels ");
        }
    }

    public static void main(String[] args) {
        Main3 q1 = new Main3();
        q1.alph(sc.next().charAt(0));
    }

}
