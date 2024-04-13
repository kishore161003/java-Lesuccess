import java.util.Scanner;

class Icecream {

    public void Quantity(int r, int h) {
        System.out.println((0.33) * Math.PI * r * r * h);
    }

    public void Quantity(int r) {
        System.out.println((1.33) * Math.PI * r * r * r);
    }
}

public class Main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        if (s.length == 1) {
            new Icecream().Quantity(Integer.parseInt(s[0]));
        } else {
            new Icecream().Quantity(Integer.parseInt(s[0]), Integer.parseInt(s[1]));

        }
    }
}
