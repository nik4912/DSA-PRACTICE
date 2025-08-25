import java.util.*;

public class primenorange {

    public static boolean isPrime(int n) {
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
    

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("The prime numbers from 1 to " + n + " are: ");
        primeInRange(n);
    }
}
