import java.util.*;
public class sumnfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no: ");
        int x = sc.nextInt();
        int sum =0;

        for(int i=0;i<=x;i++){
            sum += i;

        }
        System.out.println("sum: "+sum);
    }
    
}
