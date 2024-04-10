import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Day6 {
    static Scanner sc = new Scanner(System.in);

    public static int Question1helper(int ind, int n, int[] arr, int k, int[] dp) {
        if (ind >= n)
            return 0;
        if (dp[ind] != -1)
            return dp[ind];
        int pick = arr[ind] + Question1helper(ind + k + 1, n, arr, k, dp);
        int nonPick = Question1helper(ind + 1, n, arr, k, dp);
        return dp[ind] = Math.max(pick, nonPick);
    }

    public static void Question1() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        int ans = 0;
        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 0;
        }
        for (int i = n - 1; i >= 0; i--) {
            int pick = arr[i];
            if (i + k + 1 < n) {
                pick += dp[i + k + 1];
            }
            int nonPick = 0;
            if (i + 1 < n) {
                nonPick = dp[i + 1];
            }
            dp[i] = Math.max(pick, nonPick);
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);

        // System.out.println(helper(0, n, arr, k, dp));

    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void Question2helper2(char[] digits, int ind, List<String> permutations) {
        if (ind == digits.length - 1) {
            permutations.add(new String(digits));
            return;
        }

        for (int i = ind; i < digits.length; i++) {
            swap(digits, ind, i);
            Question2helper2(digits, ind + 1, permutations);
            swap(digits, ind, i);
        }
    }

    public static List<String> Question2helper1(long number) {
        char[] digits = String.valueOf(number).toCharArray();
        Arrays.sort(digits);
        List<String> permutations = new ArrayList<>();
        Question2helper2(digits, 0, permutations);
        return permutations;
    }

    public static void Question2() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = sc.nextInt();
        List<String> permutations = Question2helper1(n);
        int f = 1;
        for (String it : permutations) {

            int number = Integer.parseInt(it);
            if (number % d == 0) {
                f = 0;
                System.out.println(number);
                break;
            }
        }
        if (f == 1)
            System.out.println("-1");

    }

    public static boolean Question3helper(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2) {
        for (char ch : hm1.keySet()) {
            if (hm2.containsKey(ch)) {
                int val = hm1.get(ch) - hm2.get(ch);
                if (val > 0 || val < 0) {
                    return false;

                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void Question3() {
        String st = sc.next();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (sc.next().charAt(0) == 'L')
                arr[i] = sc.nextInt();
            else
                arr[i] = -sc.nextInt();
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        int p = 0;
        for (int i = 0; i < n; i++) {
            int newInd = (p + arr[i]) % (st.length());
            if (newInd < 0) {
                newInd = newInd + st.length();

                hm.put(st.charAt(newInd), hm.getOrDefault(st.charAt(newInd), 0) + 1);

                p = newInd;
            } else if (newInd >= st.length()) {
                newInd = newInd - st.length();
                hm.put(st.charAt(newInd), hm.getOrDefault(st.charAt(newInd), 0) + 1);

                p = newInd;
            } else {
                hm.put(st.charAt(newInd), hm.getOrDefault(st.charAt(newInd), 0) + 1);
                p = newInd;
            }
        }
        HashMap<Character, Integer> hm2 = new HashMap<>();
        int prev = 0;
        for (int i = 0; i < n; i++) {
            hm2.put(st.charAt(i), hm2.getOrDefault(st.charAt(i), 0) + 1);
        }
        if (Question3helper(hm, hm2)) {
            System.out.println("YES");
        } else {
            boolean flag = true;
            for (int i = 1; i < st.length() - n; i++) {
                int c = hm2.get(st.charAt(prev));
                if (c == 1) {
                    hm2.remove(st.charAt(prev));
                } else {
                    hm2.put(st.charAt(prev), c - 1);
                }
                prev++;
                hm2.put(st.charAt(i), hm2.getOrDefault(st.charAt(i), 0) + 1);
                if (Question3helper(hm, hm2)) {
                    System.out.println(hm + " " + hm2);
                    System.out.println("YES");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("NO");
            }
        }

    }

    public static void main(String[] args) {
        Question3();
    }
}

