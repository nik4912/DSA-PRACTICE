import java.util.*;
public class factorialno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact =1;
        System.out.print("enter a no : ");
        int f = sc.nextInt();

        for(int i=1;i<=f;i++){
            fact *=i;
        }
        System.out.println("factoria of no: "+fact);

    }
    
}
