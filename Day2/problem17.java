package Day2;
import java.util.*;
public class problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int i=1;
        int prev=st.charAt(0)=='1' ? 1 : 0;

        while(i<st.length()){
            if(st.charAt(i)=='A'){
                int r = st.charAt(i+1)=='1' ? 1 : 0;
                prev&=r;
            }
            else if(st.charAt(i)=='B'){
                    int r = st.charAt(i+1)=='1' ? 1 : 0;
                prev|=r;
            }
            else{
                int r = st.charAt(i+1)=='1' ? 1 : 0;
                prev^=r;

            }
            i+=2;
        }
        System.out.println(prev);
    }
}
