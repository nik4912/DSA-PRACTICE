import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int sum =0;
        int digits = Integer.toString(n).length();

        while(n>0){
            int rem = n%10;
            sum += Math.pow(rem, digits);
            n = n/10;

        }
        if(original == sum){
            System.out.println("is armstrong");
        }
        else{
            System.out.println("is not armstrong");
        }

    }
    
}
