import java.util.Scanner;

public class Day5 {
    
    static Scanner sc = new Scanner(System.in);

    public static void isEqual() {
        String st = sc.next();
        if (st.equals("Dhoni")) {
            System.out.println("Is Equals");
        } else {
            System.out.println("Not Equals");
        }
    }

    public static void operations() {
        String st1 = sc.nextLine();
        String st2 = sc.next();
        System.out.println(st1.length() + " " + st2.length());
        System.out.println(st1 + " " + st2);
        System.out.println(st1.toUpperCase());
    }

    public static void isPalindrome() {
        String st = sc.next();
        int i = 0, j = st.length() - 1;
        boolean flag = true;
        while (i <= j) {
            if (st.charAt(i) == st.charAt(j)) {
                i++;
                j--;
            } else {
                System.out.println(st + " : not a palindrome");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(st + " : palindrome");
        }
    }

    public static void VowelsCount() {
        String st = sc.next();
        String vowels = "AEIOUaeiou";
        int count = 0;
        for (char ch : st.toCharArray()) {
            if (vowels.contains("" + ch))
                count++;
        }
        System.out.println(count);
    }

    public static void naiveAlgorithm() {
        String st = sc.next();
        String pat = sc.next();
        int ind = st.indexOf(pat);
        if (ind == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at" + ind);
        }
    }

    public static void lex() {
        String st = sc.next();
        String st2 = sc.next();
        System.out.println(st.compareTo(st2));
    }

    public static void removeVowels() {
        String st = sc.next();
        String vowels = "AEIOUaeiou";
        StringBuilder newString = new StringBuilder("" + st.charAt(0));
        int p = 0;
        for (int i = 1; i < st.length(); i++) {
            if (!vowels.contains("" + st.charAt(i))) {
                newString.append(st.charAt(i));
                p++;
            } else {
                if (!vowels.contains("" + newString.charAt(p))) {
                    newString.append(st.charAt(i));
                    p++;
                }
            }
        }
        System.out.println(newString);
    }

    public static void removeSpace() {
        String st = sc.nextLine();
        String[] stArray = st.split("\\s");
        System.out.println(String.join("", stArray));
    }

    public static void middle() {
        String st = sc.next();
        if (st.length() % 2 == 0) {
            System.out.println(st.charAt((st.length() / 2) - 1) + "" + st.charAt(st.length() / 2));
        } else {
            System.out.println(st.charAt(st.length() / 2));
        }

    }

    public static void camelCase() {


        String st = sc.nextLine();
        String[] stArray = st.split("\\s");
        StringBuilder newString = new StringBuilder();
        for (String word : stArray) {
            char[] wordArray = word.toCharArray();
            wordArray[0] = Character.toUpperCase(wordArray[0]);
            newString.append(new String(wordArray));
        }
        System.out.println(newString.toString());
    }

    
    public static void captionContest() {
        int possible = 0;
        int notMatch = 0;
        String st1 = sc.next();
        String st2 = sc.next();
        int n = st1.length();
        for (int i = 0; i < n; i++) {
            if (st1.charAt(i) == '?' || st2.charAt(i) == '?') {
                possible++;
            } else if (st1.charAt(i) != st2.charAt(i)) {
                notMatch++;
            }

        }
        System.out.println(notMatch + " " + (possible + notMatch));
    }
   

    public static void main(String[] args) {
        // isEqual();
        // operations();
        // isPalindrome()
        // captionContest();
        ;
    }
}
