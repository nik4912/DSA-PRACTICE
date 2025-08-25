import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a base: ");
        int base = sc.nextInt();
        System.out.print("enter a exponent: ");
        int exponent = sc.nextInt();
        int result = 1;
        for(int i=1;i<=exponent;i++){
            result *= base;
        }
        System.out.print("the power is: "+result);
    }
    
}

