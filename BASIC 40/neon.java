import java.util.*;

public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int square = n*n;
        int sum = 0;
        while(square>0){
            int rem = square%10;
            sum = sum + rem;
            square /= 10;
        }

        if(sum == n){
            System.out.println("it is neon number");
        }
        else{
            System.out.println("not neon number");
        }
        
    }
    
}
