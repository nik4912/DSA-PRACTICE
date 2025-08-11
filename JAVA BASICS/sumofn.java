import java.util.*;

public class sumofn {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("enter a no of number: ");
        int n = sc.nextInt();

        int sum = (n * (n + 1)) / 2;

        System.out.println("the sum is "+sum);



    }
    
}
