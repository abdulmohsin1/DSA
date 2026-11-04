import java.util.Scanner;

public class Looop {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
         int ans=reverse(n);
        System.out.println(ans);
    }

     static  int reverse(int n) {

         int c = 0;
         int rem;
         while (n > 0) {
              rem = n % 10;
             c= c*10+rem;
             n=n/10;

         } return c;

     }
}
