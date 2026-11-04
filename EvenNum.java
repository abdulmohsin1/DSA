import java.util.Scanner;

public class EvenNum {
    static void main() {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int ans=checkEvn(n);
        System.out.println(ans);

    }
     static int checkEvn(int n) {

         while (n > 0) {
             int rem = n % 10;
             if (rem % 2 == 0) {
                 System.out.println(rem + " is even");
             } else {
                 System.out.println(rem + " not an even");
             }
             n = n / 10;
         }return 0;

     }
}
