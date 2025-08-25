import java.util.*;

public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a first number: ");
        int a = sc.nextInt();

        System.out.println("enter a first number: ");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.print("the a= "+a+", the b="+b);




    }
    
}
