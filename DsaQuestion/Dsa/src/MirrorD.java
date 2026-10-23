import java.util.Scanner;

public class MirrorD {
    public static  void main(){
        Scanner in= new Scanner(System.in);
        int n =in.nextInt();
        System.out.println(rev(n));
    }
    static int rev(int n){
        int d=0;
       int org=0;

        while(n>0){
            int rem=n%10;
            d=d*10+rem;
            n=n/10;

        }int ans = d - org;
        return ans < 0 ? - ans : ans ;
    }




}
