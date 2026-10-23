import java.util.Scanner;

public class Diff {
    static void main() {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int ans=dif(n);
        System.out.println(ans);
    }
     static int dif(int n){
        int max=0;
        int min=9;
         int difff=0;
         while(n>0){
             int rem=n%10;
              if(rem>max){
                  max=rem;
              }if(rem<min){
                  min=rem;

             }n=n/10;
         }return difff=max-min;
     }

}
