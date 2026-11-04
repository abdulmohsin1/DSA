import java.util.Scanner;

public class OddValue {
    static void main() {
        Scanner in= new Scanner(System.in);
         int n= in.nextInt();
         int ans= checkOdd(n);
        System.out.println(ans);
    }

     static int checkOdd(int n){
         while(n>0){
             int rem= n%10;
             if(n%2 !=0){
                 System.out.println(rem+ " is an odd");
             }else {
                 System.out.println(rem+ " is and even ");
             }n=n/10;
         }return 0;
     }




}
