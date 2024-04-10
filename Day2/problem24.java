package Day2;
import java.util.Scanner;

public class problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalHandshakes = n * (n - 1) / 2;
        System.out.println( totalHandshakes);
    }
}
