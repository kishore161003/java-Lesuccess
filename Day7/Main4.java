package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    static Scanner sc = new Scanner(System.in);
    int[] arr;
    int tar;
    int n;

    public void getInputArr() {
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        tar = sc.nextInt();
    }

    public ArrayList<ArrayList<Integer>> twoSum() {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        while (j >= 0 && i < n) {
            int sum = arr[i] + arr[j];
            if (sum == tar) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[j]);
                al.add(temp);
                i += 1;
                j -= 1;
            } else if (sum < tar) {
                i += 1;
            } else {
                j -= 1;
            }
        }
        return al;
    }

    public static void main(String[] args) {
        Main4 q1 = new Main4();
        q1.getInputArr();
        ArrayList<ArrayList<Integer>> res = q1.twoSum();
        for (ArrayList<Integer> al : res) {
            System.out.println(al.get(0) + " " + al.get(1));
        }
    }

}
