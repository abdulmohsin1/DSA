import java.util.Scanner;

public class CountAndD {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(summ(n));
    }

  static   int summ(int n) {
        int count = 0;
        int original=n;
        while (n > 0) {
            int rem = n % 10;
            if (rem!=0 && original %rem == 0) {
                count += 1;
            }
            n = n / 10;
        }
        return count;


    }


}