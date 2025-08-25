import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no: ");
        int x = sc.nextInt();
        int rev = 0;

        while(x>0){
            int d= x%10;
            rev = rev*10+d;
            x = x/10;
        }
        System.out.println(rev);
    }
    
}
 
