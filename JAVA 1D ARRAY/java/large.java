import java.util.*;

public class large {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a first number: ");
        int a = sc.nextInt();

        System.out.println("enter a second number: ");
        int b = sc.nextInt();

        System.out.println("enter a third number: ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is largest no: "+a);
        }
        else if(b>a && b>c){
            System.out.println("b is largest no: "+b);
        }
        else{
            System.out.println("c is largest no: "+c);
        }


    }
    
}
