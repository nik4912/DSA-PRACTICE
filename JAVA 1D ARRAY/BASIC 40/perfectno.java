import java.util.*;

public class perfectno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int original = n;
        for(int i=1;i<n;i++){
            if(n % i == 0){
                sum = sum+i;  
            }
        }
        if(original == sum)
        System.out.println("its perfect no");
        else
        System.out.println("not perfect no");
       
    }
    
}
