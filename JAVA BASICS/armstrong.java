import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a num: ");
        int x = sc.nextInt();
        int sum =0;
        int original = x;
        int digit = (int)Math.log10(x) + 1;
         while(x > 0){
            int rem = x % 10;
            sum += Math.pow(rem, digit);
            x = x / 10;

         }
         if(sum == original){
            System.out.println("its is armstrong");
         }
         else{
            System.out.println("not a armstrong");
         }
        
    }
    
}
