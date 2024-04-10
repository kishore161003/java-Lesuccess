package Day2;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println(ch + " is a Lowercase Alphabet");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println(ch + " is a Uppercase Alphabet");
        }
        else{
            System.out.println(ch + " is not an Alphabet");
    }   
}
}
