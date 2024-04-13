package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Day7HW {
    static Scanner sc = new Scanner(System.in);

    static void Question1() {
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void Question2() {
        String st = null;
        int ind = sc.nextInt();
        try {
            System.out.println(st.charAt(ind));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void Question3() {
        try {
            int a = sc.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void Question4() {
        String email = sc.next();
        try {
            int dotIndex = email.lastIndexOf('.');
            int atIndex = email.indexOf('@');
            if (dotIndex == -1 || (dotIndex > 0 && dotIndex == email.length() - 1)) {
                throw new DotException("Invalid Dot usage");
            }
            if (atIndex == -1) {
                throw new AtTheRateException("Invalid @ usage");
            }
            String domain = email.substring(dotIndex + 1);
            List<String> list = new ArrayList<>();
            list.add("in");
            list.add("com");
            list.add("biz");
            list.add("net");
            if (!list.contains(domain)) {
                throw new DomainException("Invalid Domain");
            }
            System.out.println("Valid email address");
        } catch (DotException e) {
            System.out.println("DotException: " + e.getMessage());
            System.out.println("Invalid email address");
        } catch (AtTheRateException e) {
            System.out.println("AtTheRateException: " + e.getMessage());
            System.out.println("Invalid email address");
        } catch (DomainException e) {
            System.out.println("DomainException: "
                    + e.getMessage());
            System.out.println("Invalid email address");
        }
    }

    static class DotException extends Exception {

        DotException(String message) {
            super(message);
        }
    }

    static class AtTheRateException extends Exception {
        AtTheRateException(String message) {
            super(message);
        }
    }

    static class DomainException extends Exception {
        DomainException(String message) {
            super(message);
        }
    }

    static void Question5() {
        sc.nextLine();
        String regNo = sc.nextLine();
        String phone = sc.nextLine();
        try {
            validateRegNo(regNo);
            validatePhone(phone);
            System.out.println("Valid");
        } catch (NumberFormatException e) {
            System.out.println("Invalid");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
            System.out.println(e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("Invalid");
            System.out.println(e.getMessage());
        }
    }

    public static void validateRegNo(String reg) {
        if (reg.length() != 9) {
            throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
        }
        boolean flag = true;
        for (char c : reg.toCharArray()) {
            if (!Character.isAlphabetic(c) &&
                    !Character.isDigit(c)) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            throw new NoSuchElementException(
                    "Registration Number cannot contain any character other than digits and alphabets in format specified");
        }
    }

    public static void validatePhone(String phone) {
        if (phone.length() != 10) {
            throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
        }
        try {
            Long.parseLong(phone);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
        }
    }

    public static void main(String[] args) {
        // Question1();
        // Question2();
        // Question3();
        Question4();
        Question5();
    }
}
