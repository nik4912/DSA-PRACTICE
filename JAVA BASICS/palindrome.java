import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no: ");
        int x = sc.nextInt();
        int original =x;
        int rev = 0;
    

        while(x>0){
            int d= x%10;
            rev = rev*10+d;
            x = x/10;
        }
        if(rev == original){
            System.out.println("yes, is palidrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    
}
