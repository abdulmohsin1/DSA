import java.util.Scanner;

public class Tocheck {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int ans=check(n);
        System.out.println(ans);
    }
     static int check(int n ){
        while(n>0){
            int rem=n%10;
            if(rem>=5){
                System.out.println(rem+ " is greater");
            }else {
                System.out.println(rem+ " is less");
            }
            n=n/10;
        }
        return 0;
     }

}
