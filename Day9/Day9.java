package Day9;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class Day9 {
    static Scanner sc = new Scanner(System.in);

    static void question1() {
        String st = sc.next();
        String ipvPattern = "^((25[0-5])|(2[0-4][0-9])|([01]?[0-9][0-9]?)\\.){3}((25[0-5])|(2[0-4][0-9])|([01]?[0-9][0-9]?))$";
        Pattern p = Pattern.compile(ipvPattern);
        Matcher m = p.matcher(st);
        if (m.matches()) {
            System.out.println("IP address " + st + " is Valid");
        } else {
            System.out.println("IP address " + st + " is InValid");
        }
    }

    static void question2() {
        String st = sc.nextLine();
        Pattern p = Pattern.compile("^[A-FH-Za-fh-z0-9]+[A-z0-9]+[Gg][A-z0-9]+[A-FH-Za-fh-z0-9]+$");
        Matcher m = p.matcher(st);
        if (m.matches()) {
            System.out.println("Found a match");
        } else {
            System.out.println("Not matched!");
        }
    }

    static void question4() {
        String st = sc.next();
        Pattern p = Pattern.compile("\\.[0-9]+[^0]+");
        Matcher m = p.matcher(st);
        if (m.find()) {
            System.out.println(m.group().length() - 1);
        }
    }

    static void question5() {
        String st = sc.next();
        Pattern p = Pattern.compile("[^aeiouAEIOU]");
        Matcher m = p.matcher(st);
        while (m.find()) {
            System.out.print(m.group());
        }
        p = Pattern.compile("[aeiouAEIOU]");
        m = p.matcher(st);
        while (m.find()) {
            System.out.print(m.group());
        }

    }

    void 

    public static void main(String[] args) {
        question5();
    }
}
