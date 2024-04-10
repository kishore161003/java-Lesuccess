package Day2;
import java.util.Scanner;

public class problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        for (int i = left; i <= right; i++) {
            int sum = 0;
            int prod = 1;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                prod *= temp % 10;
                temp /= 10;
            }
            if (sum + prod == i) {
                System.out.println(i);
            }

        }

    }
}
