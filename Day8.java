import java.util.Arrays;
import java.util.Scanner;

public class Day8 {
    static Scanner sc = new Scanner(System.in);

    static int Question1helper(int litres, int[] BottleSizes, int dp[]) {
        if (litres == 0)
            return 0;
        if (dp[litres] != 0)
            return dp[litres];
        if (litres < 0) {
            return Integer.MAX_VALUE;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++)
            if (litres >= BottleSizes[i])
                ans = Math.min(ans, 1 + Question1helper(litres - BottleSizes[i], BottleSizes, dp));
        return dp[litres] = ans;
    }

    static void Question1() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int dp[] = new int[1000];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] BottleSizes = new int[] { 1, 5, 7, 10 };
        for (int i : arr)
            System.out.println(Question1helper(i, BottleSizes, dp));
    }

    static void Question2() {
        String s = sc.nextLine();
        String t = sc.nextLine();
        int count = 0;
        int c = 0;
        int c0 = 0;
        int c1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                c++;
            } else if (s.charAt(i) != t.charAt(i)) {
                if (s.charAt(i) == '0') {
                    c0++;
                } else {
                    c1++;
                }
            }
        }
        if (c1 > c0) {
            System.out.println("Invalid");
        } else {
            System.out.println(c0 + c);
        }
    }

    static boolean Question3helper(int[] power, int initPower, int nextLevel, int maxtime) {
        Arrays.sort(power);
        for (int i = 0; i < power.length; i++) {
            if (initPower < power[i])
                return false;
            initPower += (initPower - power[i]);
        }
        if (initPower < nextLevel) {
            return false;
        }
        return true;
    }

    static void Question3() {
        int n = sc.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int Zombies = sc.nextInt();
            int maxtime = sc.nextInt();
            int[] power = new int[Zombies];
            for (int j = 0; j < Zombies; j++)
                power[j] = sc.nextInt();
            int initPower = sc.nextInt();
            int nextLevel = sc.nextInt();
            if (maxtime < Zombies) {
                res[i] = 0;
            } else {
                if (Question3helper(power, initPower, nextLevel, maxtime)) {
                    res[i] = 1;
                } else {
                    res[i] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (res[i] == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static int Question4helper(int[] arr, int n) {
        
        if (n == 1)
            return arr[0];
        if (n == 2)
            return arr[1 + arr[0]];
        int prev = arr[0] + arr[1];
        int res = prev;
        for (int i = 2; i < n; i++) {
            res = res + (prev + arr[i]);
            prev = (prev + arr[i]);

        }
        return res;

    }

    static void Question4() {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            int arr[] = new int[ele];
            for (int j = 0; j < ele; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(Question4helper(arr, ele));
        }

    }

    static void Question5() {
        int n = sc.nextInt();
        int[] holes = new int[n];
        for (int i = 0; i < n; i++)
            holes[i] = sc.nextInt();
        int noOFBalls = sc.nextInt();
        int[] balls = new int[noOFBalls];
        for (int i = 0; i < noOFBalls; i++) {
            balls[i] = sc.nextInt();
        }
        int[] res = new int[noOFBalls];
        int[] maxBalls = new int[n];
        for (int i = 0; i < noOFBalls; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (balls[i] <= holes[j] && maxBalls[j] < (j + 1)) {

                    res[i] = j + 1;
                    maxBalls[j]++;
                    break;
                }
            }
        }
        for (int i = 0; i < noOFBalls; i++)
            System.out.print(res[i] + " ");
    }

    public static void main(String[] args) {
        Question5();

    }
}
