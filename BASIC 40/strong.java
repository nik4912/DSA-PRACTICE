import java.util.*;

public class strong {
    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + fact(rem);
            n /= 10;   
        }
       // System.out.println(sum);
        if(original == sum){
            System.out.println("this is strong no");
        }
        else{
            System.out.println("this is not strong no");
        }
        
    }
    
}
