import java.util.*;

public class primeno {
    public static boolean isPrime(int n){
        boolean isPrime = true;

        if(n == 2){
            return true;
        }

        for(int i=2; i<=n;i++){
        if(n%2==0){
            isPrime = false;
            break;
        }
        
    }
    return isPrime;
   

}
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int n= sc.nextInt();
    boolean idx = isPrime(n);
    System.out.println("the prime no: "+idx);
       
   }
}

