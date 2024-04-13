import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Day10 {
    static int Question1helper(int i, int j, int[][] mat) {
        return mat[i][j] + mat[i][j + 1] + mat[i][j + 2] + mat[i + 1][j + 1] + mat[i + 2][j] + mat[i + 2][j + 1]
                + mat[i + 2][j + 2];
    }

    static void Question1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int maxi = 0;
        for (int i = 0; i <= mat.length - 3; i++) {
            for (int j = 0; j <= mat[0].length - 3; j++) {
                int ans = Question1helper(i, j, mat);
                maxi = Math.max(ans, maxi);
            }
        }
        System.out.println(maxi);
    }

    static boolean Question2helper(String n) {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('9', '6');
        hm.put('6', '9');
        hm.put('8', '8');
        hm.put('1', '1');
        hm.put('0', '0');
        int l = 0, r = n.length() - 1;
        while (l <= r) {
            if (!hm.containsKey(n.charAt(l)) || !hm.containsKey(n.charAt(r))) {

                return false;
            } else if (hm.get(n.charAt(l)) != n.charAt(r)) {
                System.out.println(hm.get(n.charAt(l)) + " " + n.charAt(r));
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    static void Question2() {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if (Question2helper(n)) {
            System.out.println(n + " is the strobogrammatic  number");
        } else {
            System.out.println(n + " is the not strobogrammatic  number");

        }

    }

    static void Question3() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        boolean[] isPrime = new boolean[n + 1];

        for (int p = 2; p * p <= n; p++) {
            if (!isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = true;
                }
            }
        }

        System.out.println("Prime numbers up to " + n + ":");
        for (int i = s; i <= n; i++) {
            if (!isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static void Question4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                al.add(arr[i]);
                maxi = arr[i];
            }
        }
        System.out.println(al);

    }

    static void Question5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 128) {
            System.out.println("Invalid");
        }
        String st = Integer.toBinaryString(n);
        while (st.length() < 8) {
            st = '0' + st;
        }
        System.out.println(Integer.parseInt(st.substring(4, 8) + st.substring(0, 4), 2));

    }

    public static void main(String[] args) {
        Question5();
    }
}
