public class DivideToZero {
    static void main() {
        int ans=toZero(147);
        System.out.println(ans);

    }
    static int toZero(int n){
        int count=0;

        while(n !=0){

            if(n%2 !=0){
                n--;
            }
            else{
                n=n/2;
            }count++;
            }return count;
    }
}
