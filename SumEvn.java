import java.util.Scanner;

public class SumEvn {
    static void main() {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(sumEven(n));
    }

     static int sumEven(int n){
        int sum=0;
        while(n>0){
            int rem= n%10;
            if(rem%2==0){
                sum+=rem;
            }n=n/10;
        }return sum;
     }


}
