package Day2;
/**
 * problem1
 */

import java.util.*;
 public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // System.out.println(Math.max(a,Math.max(b,c)) + " is the Greatest among Three ");
        if(a<b && c<b){
            System.out.println(b + " is the greatest among three");
        }
        else if(a<c){
            System.out.println(c+" is the Greatest among three");
        }
        else{
            System.out.println(a+" is the greatest among three");
        }
        sc.close();
    }
    
}
