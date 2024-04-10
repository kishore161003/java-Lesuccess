import java.util.Scanner;

public class Day4HW {
    static Scanner sc = new Scanner(System.in);

    public static void MatrixSum() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        int[] row = new int[n];
        int[] col = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++)
                sum += mat[i][j];
            row[i] = sum;
        }
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += mat[j][i];
            col[i] = sum;
        }
        for (int i = 0; i < n; i++)
            System.out.println("Sum of the row " + i + " = " + row[i]);
        for (int i = 0; i < n; i++)
            System.out.println("Sum of the Column " + i + " = " + col[i]);
    }

    public static void MatrixCalc() {
        int n = sc.nextInt();
        int[][] mat1 = new int[n][n];
        int[][] mat2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat1[i][j] + mat2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Difference");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat1[i][j] - mat2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multiply");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++)
                    sum += mat1[i][k] * mat2[k][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static void paintClass() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int o = 0, t = 0, th = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 1)
                o++;
            else if (arr[i] == 2)
                t++;
            else
                th++;
        }
        System.out.println(n - Math.max(o, Math.max(t, th)));
    }

    public static void MovieCollision() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int o = 0;
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 1)
                    o++;
            }
            sum += (o * (o - 1) / 2);
        }
        System.out.println(sum);
    }

    public static void isLand() {
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] > 10 && mat[i][j] != 20)
                    flag = false;

            }
        }
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        // MatrixSum();
        // MatrixCalc();
        // paintClass();
        MovieCollision();
    }
}
