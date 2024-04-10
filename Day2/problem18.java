package Day2;
import java.util.Scanner;

public class problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        int count = 0;
        int prev=0;
        for(int i=0; i<n; i++){
            if((arr1[i]-prev) >= arr2[i]){
                count++;
            }
            prev = arr1[i];
        }
        System.out.println(count);
    }   
    
}
