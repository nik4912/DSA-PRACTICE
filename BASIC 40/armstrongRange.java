import java.util.*;

public class armstrongRange {
    public static boolean armstrong(int n){
        int original = n;
        int sum =0;
        int digits = Integer.toString(n).length();
    
         while(n>0){
            int rem = n%10;
            sum += Math.pow(rem, digits);
            n = n/10;
    
        }
        return sum == original;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a start: ");
        int start = sc.nextInt();
        System.out.print("enter a end: ");
        int end = sc.nextInt();

        for(int i= start; i<=end;i++){
            if(armstrong(i)){
                System.out.print(i+" ");
            }

        }
        
        
       
    }
    
}
