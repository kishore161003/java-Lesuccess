import java.util.Scanner;

public class Day5HW {
    static Scanner sc = new Scanner(System.in);

    public static void Question1() {
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.next();

        int cookie = 0;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals("cookie"))

                cookie++;
            else
                cookie = 0;
            if (cookie >= 2) {
                flag = false;
                break;
            }
        }
        if (cookie >= 1)
            flag = false;
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    // public
    public static void Question2() {
        String st = sc.next();
        if (st.matches("\\+91[0-9]{10}")) {
            System.out.println("Mobile number valid");
        } else {
            System.out.println("Mobile number Invalid");
        }
    }

    public static void Question3() {
        String st = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(st.charAt(0));
        for (int i = 1; i < st.length(); i++) {
            if (st.charAt(i) == st.charAt(i - 1)) {
                sb.append("*");
            }
            sb.append(st.charAt(i));
        }
        System.out.println(sb.toString());
    }

    public static void Question4() {
        String n = sc.next();
        boolean flag = false;
        for (int i = 1; i < n.length(); i++) {
            for (int j = i + 1; j < n.length(); j++) {
                int a = Integer.parseInt(n.substring(0, i));
                int s = Integer.parseInt(n.substring(i, j));
                if (check(a, s, n.substring(j))) {
                    flag = true;
                }
            }
        }
        System.out.println(flag ? "true" : "false");
    }

    public static boolean check(int a, int s, String r) {
        if (r.isEmpty()) {
            return true;
        }
        String sn = String.valueOf(a + s);
        if (r.startsWith(sn)) {
            return check(s, Integer.parseInt(sn), r.substring(sn.length()));
        }
        return false;
    }

    public static void Question5() {
        String st = sc.next();
        String res = "";
        for (int i = 0; i < st.length(); i++) {
            if (st.endsWith(st.substring(0, i))) {
                res = st.substring(0, i);
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Question4();

    }
}
