import java.util.Scanner;

public class Day3 {
    static Scanner sc;

    public static void pattern1() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }

    }

    public static void pattern2() {
        sc = new Scanner(System.in);
        String st = sc.next();
        for (int i = 0; i < st.length(); i++) {
            for (int j = 0; j < st.length(); j++) {
                if (i == j) {
                    System.out.print(st.charAt(i) + " ");
                } else if (j == (st.length() - 1 - i)) {
                    System.out.print(st.charAt(j) + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int colLength = 2 * n - 1;
        for (int i = 1; i <= colLength; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("b" + " ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= colLength - ((2 * i) + 2); j++) {
                System.out.print("i" + " ");
            }
            if (i != n - 1) {
                for (int j = 1; j <= 1; j++) {
                    System.out.print("*" + " ");
                }
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("b" + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int colLength = 2 * n - 1;
        for (int i = n; i > 0; i--) {
            for (int j = colLength; j > 0; j--) {
                if (i == j || j == (colLength - i + 1) || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void pattern5() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= (2 * n) - 1; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                System.out.print(i == n || j == n ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void pattern6() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        for (int i = (int) Math.ceil(n / 2); i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(i * (j - i + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void qn7() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        double prev = 1;
        for (int i = 2; i <= n; i++) {
            fact = (fact * i);
            prev += (i / (double) fact);
        }
        System.out.println(prev);
    }

    public static void qn8() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= Math.ceil((int) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i)
                    sum += (n / i);
            }

        }
        System.out.println(n + (sum - n == n ? " " : " Not") + " perfect Number");
    }

    public static void pattern10() {
        int n = sc.nextInt();
        int colLength = 2 * n - 1;
        for (int i = n; i > 0; i--) {
            char p = 'A';
            // System.out.println(colLength - i);
            for (int j = 0; j <= colLength - i; j++) {
                System.out.print(j < i - 1 ? " " : p++);
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            char p = 'A';
            for (int j = 0; j < colLength - i; j++) {
                System.out.print(j < i ? " " : p++);
            }
            System.out.println();
        }
    }

    public static int streak(int i, int s) {
        for (int j = 1; j <= s; j++) {
            if ((i + j) % (j + 1) != 0) {
                return j;
            }
        }
        return s + 1;
    }

    public static void qn9() {
        int s = sc.nextInt();
        int N = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            int ans = streak(i, s);
            if (ans == s) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        // pattern1(5);
        // pattern2("birds");
        // pattern3(6);
        // pattern4(3);
        // pattern5(4);
        // pattern6(7);
        // qn7(2);
        // qn8(9);
        qn9();
        // pattern10(4);
    }

}
