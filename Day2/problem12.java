package Day2;
import java.util.*;
public class problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n = m > 0 ? 1 : m==0 ? 0: -1;
        System.out.println("The value of n = "+n);
    }
}
