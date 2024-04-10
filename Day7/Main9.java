package Day7;

import java.util.Scanner;

class EmailValidation {
    boolean checkEmail(String email) {
        if (email.matches("[a-z]+@[a-z]+\\.(in|com|biz|net)")) {
            return true;
        } else
            return false;

    }
}

class EmailValidationMain {
    Scanner sc = new Scanner(System.in);

    public void main() {
        String email = sc.next();
        if (new EmailValidation().checkEmail(email)) {
            System.out.println("valid : " + email);
        } else {
            System.out.println("invalid : " + email);
        }
    }
}

public class Main9 {
    public static void main(String[] args) {
        EmailValidationMain em = new EmailValidationMain();
        em.main();
    }

}
