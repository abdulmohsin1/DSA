import java.util.Scanner;

public class Count {
    static void main() {
        Scanner in= new Scanner(System.in);
         int n = in.nextInt();
         int ans=counttt(n);
        System.out.println(ans);
    }
    static  int counttt(int n){
         int c=0;
         while (n>0){
             c+=1;
             n=n/10;
         }return c;
    }





}
