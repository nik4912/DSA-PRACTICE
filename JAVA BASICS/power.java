import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a exponent: ");
        int e = sc.nextInt();

        System.out.print("enter a base: ");
        int b = sc.nextInt();

        int power = (int)Math.pow(b, e);

        System.out.println("the poer of number: "+power);
    }
    
}
