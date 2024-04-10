import java.util.*;

public class Day4 {
    static Scanner sc = new Scanner(System.in);

    public static void diagonalSum() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i][i];
        System.out.println(sum);
    }

    public static void evenRowSum() {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i += 2)
            for (int j = 0; j < n; j++)
                sum += arr[i][j];
        System.out.println(sum);
    }

    public static void evenSum() {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (arr[i][j] % 2 == 0)
                    sum += arr[i][j];
        System.out.println(sum);
    }

    public static void upperSum() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                sum += arr[i][j];
        System.out.println(sum);
    }

    public static void occurance() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int tar = sc.nextInt();
        int first = -1;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[mid] < tar) {
                lo = mid + 1;
            } else if (arr[mid] > tar) {
                hi = mid - 1;
            } else {
                first = mid;
                hi = mid - 1;
            }
        }
        int last = -1;
        lo = 0;
        hi = n - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) / 2);
            if (arr[mid] < tar) {
                lo = mid + 1;
            } else if (arr[mid] > tar) {
                hi = mid - 1;
            } else {
                last = mid;
                lo = mid + 1;
            }
        }
        System.out.println(first + " " + last);
    }

    public static void goodsSum() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);

    }

    public static void pairSum() {
        int tar = sc.nextInt();

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == tar) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + tar);
                }
            }
        }
    }

    public static void pairSumCount() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int tar = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == tar) {
                    count++;
                    break;
                }
            }
        }
        if (count > 0) {
            System.out.println("Array has Two elements with Give sum" + tar);
        } else {
            System.out.println("Array doesn't has Two elements with Give sum " + tar);
        }
    }

    public static void extremes() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = (int) 1e9;
        int max = (int) -1e9;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        System.out.println("Smallest value : " + min);
        System.out.println("Largest Value : " + max);

    }

    public static void Question6() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int prod = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            prod *= arr[i];
        }

        if (sum % 2 == 0) {
            System.out.println(sum);
        } else {
            System.out.println(prod);
        }

    }

    public static void Question7() {
        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }

    public static void Question8() {
        upperSum();
    }

    public static void Question9() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j <= i; j++)
                sum += arr[i][j];
        System.out.println(sum);
    }

    public static void Question10() {
        diagonalSum();
    }

    public static void Question11() {
        String st = sc.nextLine();
        String first = sc.nextLine();
        String second = sc.nextLine();
        String[] stArray = st.split(" ");
        int fc = 0;
        int sc = 0;
        for (String ch : stArray) {
            if (ch == " ")
                continue;
            if (ch.equals(first))
                fc++;
            if (ch.equals(second))
                sc++;
        }
        if (fc > sc)
            System.out.println(first);
        else if (sc > fc)
            System.out.println(second);
        else
            System.out.println(Math.min(Integer.parseInt(second), Integer.parseInt(first)));
    }

    public static void Question12() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(a * (int) Math.pow(2, n / 2 + n % 2) + b * (int) Math.pow(2, n / 2));
    }

    public static void main(String[] args) {
        Question12();
    }
}
