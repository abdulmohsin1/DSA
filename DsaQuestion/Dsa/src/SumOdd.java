import java.util.Scanner;

public class SumOdd {
    static void main() {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumOdd(n));
    }

    static int sumOdd(int n){
        int sum=0;
        while (n>0){
            int rem=n%10;
            if(rem%2==1){
                sum+=rem;
            }n=n/10;
        }return sum;
    }
}
