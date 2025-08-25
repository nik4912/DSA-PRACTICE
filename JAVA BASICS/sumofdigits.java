import java.util.*;
public class sumofdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no: ");
        int x =sc.nextInt();
        int sum =0;

        while(x>0){
            int d = x%10;
            sum = sum*1+d;
            x = x/10;
        }
        System.out.println(sum);
    }

    
}
