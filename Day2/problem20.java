package Day2;
import java.util.*;

public class problem20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();
        f.add(1);
        al.add(f);
        for (int i = 0; i < n - 1; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 0; j < i; j++) {
                temp.add(al.get(i).get(j) + al.get(i).get(j + 1));
            }
            temp.add(1);
            al.add(temp);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(al.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
