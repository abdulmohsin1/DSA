import java.util.Scanner;

public class Pallindrom {
    static void main() {
        Scanner in= new Scanner(System.in);
        int n =in.nextInt();
        System.out.println(pallon(n));
    }

    static int pallon(int n){
        int orgNUm=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=n*10+rem;
            n=n/10;

            }if(orgNUm==rev){
            System.out.println(orgNUm +"its an pallindrom number");
        }else{
            System.out.println(orgNUm + "not a pallindrom ");
        } return rev;
}
     }
