import java.util.Scanner;

public class MutliSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }else {
            return 1+ (n-1)%9;
        }
    }


    }
