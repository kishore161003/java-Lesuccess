package Day2;
import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n-->0){

        int g = sc.nextInt();
        int rem = g%5;

        if (rem>=3 && g>37){
            System.out.println(g+5-rem);
        }
        else{
            System.out.println(g);  
        }
        
    }}
}
