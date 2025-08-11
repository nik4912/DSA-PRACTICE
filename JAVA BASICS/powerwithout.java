import java.util.*;
public class powerwithout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;

        System.out.print("enter a base: ");
        int b= sc.nextInt();

        
        System.out.print("enter a exmponent: ");
        int e= sc.nextInt();

        for(int i=0;i<e;i++){
            result *=b; 
        }

        System.out.print("the power is: "+result);


    }
    
}
