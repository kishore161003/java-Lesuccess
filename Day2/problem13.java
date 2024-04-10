package Day2;
import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp =  sc.nextInt();
        if(temp<0){
            System.out.println("Freezing Weather");
        }else if (temp<10){
            System.out.println("very Cold weather");
        }
        else if(temp<20){
            System.out.println("Cold weather");
        }
        else if(temp<30){
            System.out.println("Normal in Temp");
        }
        else if(temp<40){
            System.out.println("Its Hot");
        }
        else{
            System.out.println("its Very Hot");
        }
    }
}
