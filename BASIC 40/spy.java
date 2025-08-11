import java.util.*;

public class spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int prod = 1;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            prod = prod*rem;
            n /= 10;
        }

        if(sum == prod){
            System.out.println("it is spy number");
        }
        else{
            System.out.println("not spy number");
        }
        
    }
    
}

