import java.util.Scanner;

public class Reverse {
    public static  void main(){
        Scanner in= new Scanner(System.in);
        String n =in.next();
        System.out.println(rev(n));
    }
    static String rev(String n){
        String org=n;
     String rn=0;
        while(n!=0){
            String rem=n%10;
            rn=rn*10+rem;
            n=n/10;


        }
        if(org==rn){
            System.out.println(org + " is an pallindrom ");
        }
        else{
            System.out.println(org + " is not pallindrom");
        }return rn;
    }




}
