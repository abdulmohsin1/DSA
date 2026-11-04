import java.util.Scanner;

public class Sum {
    static void main() {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumOfNum(n));

    }
     static int sumOfNum(int n){
        int sum=0;
        while(n>0){
            int rem= n%10;
            sum+=rem;
            n=n/10;
        }return sum;

     }



}
