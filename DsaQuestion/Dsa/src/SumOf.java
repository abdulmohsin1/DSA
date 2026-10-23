import java.util.Scanner;

public class SumOf {
    static void main() {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(sum(n));
    }

     static int sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            if(rem<=5){
                sum+=rem;
            }n=n/10;
        }return  sum;
     }
}
