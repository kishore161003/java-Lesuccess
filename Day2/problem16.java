package Day2;
import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int menu = sc.nextInt();
        switch(menu){
            case 1:
                System.out.println("The addition of "+a+"and "+b +"is "+(a+b));
                break;
            case 2:
                System.out.println("The Subtraction of "+a+"and "+b +"is "+(a-b));
                break;
            case 3:
                System.out.println("The multiplication of "+a+"and "+b +"is "+(a*b));
                break;
            case 4:
                System.out.println("The Division of "+a+"and "+b +"is "+(a/b));
                break;
            default:
                System.out.println("Enter the valid number");
                break;
        }
    }
}
