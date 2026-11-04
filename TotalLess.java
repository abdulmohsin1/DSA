import java.util.Scanner;

public class TotalLess {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(lesstoFive(n));
    }
     static int lesstoFive(int n) {
         int c = 0;           //123546
         while (n > 0) {
             int rem = n % 10;
             if (rem < 5) {
                 c += 1;
             }
             n = n / 10;
         }return c;
     }
}
