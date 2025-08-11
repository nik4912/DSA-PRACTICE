import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int original = n;
        int rev =0;
        while(n>0){
            int rem = n%10;
            rev = rev*10 + rem;
            n /=10;
            
        }
    if(original == rev) {
        System.out.print("it is palindrome");  
    } else {
        System.out.print("it is not palindrome");
    }
   
    }
}





