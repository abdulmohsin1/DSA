import java.util.Scanner;

public class CountOdd {
    static void main() {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int ans=count(n);
        System.out.println(ans);
    }
    static  int count(int n){
        int c=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==1){
                c+=1;
            }n=n/10;
        }return c;
    }



}
