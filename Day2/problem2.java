package Day2;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println(n + "  is divisble by 5 and 11");
        }
        else{
         System.out.println(n + "  is not divisble by 5 and 11");
        }
    }
    
}
