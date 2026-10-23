import java.util.Scanner;

public class Product {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(proSum(n));
    }
     static  int proSum(int n ) {
         int df = 0;
         int pro = 1;
         int sum = 0;
         while (n > 0) {

             int rem = n % 10;
             pro *=rem;
             sum += rem;
             df = pro - sum;
             n = n / 10;
         }
         return df;

     }


}
