package Day2;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isLetter(ch)) {
            System.out.println("The character is an alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is a special character.");
        }
    }
}
