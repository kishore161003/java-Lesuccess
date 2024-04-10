package Day2;
import java.util.Scanner;

public class problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 0;
        int third = 1;
        if (n == 1) {
            System.out.print(0 + " ");
        } else if (n == 2) {
            System.out.println(0 + " " + 1 + " ");
        } else {
            System.out.print(0 + " " + 0 + " " + 1 + " ");
            while (n-- > 3) {
                int fourth = first + second + third;
                System.out.print(fourth + " ");
                first = second;
                second = third;
                third = fourth;
            }
            System.out.println();
        }
    }

}
