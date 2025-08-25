import java.util.*;
public class lcm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a fisrt no: ");
        int a = sc.nextInt();
        System.out.println("enter a fisrt no: ");
        int b = sc.nextInt();
        int gcd = 1;
        int min = Math.min(a, b);

        for(int i = min; i>=1;i--){
            if(a % i == 0 && b % i == 0){
                gcd = i;
                break;
            }
        }

        int lcm = (a*b)/gcd;
        System.out.println("the gcd is: "+gcd);
        System.out.println("the lcm is: "+lcm);


    }
    
}
