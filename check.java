import java.util.Scanner;

public class check {
    static void main() {
        Scanner  in = new Scanner(System.in);
         int n= in.nextInt();
         int ans= checkzero(n);
        System.out.println(ans);
    }

    static int checkzero(int n){
         int count=0;       //45050
         while (n>0){
             int rem=n%10;
             if(rem==0){
                 count+=1;
             }n=n/10;

         } return count;
    }
}
