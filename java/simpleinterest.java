import java.util.*;

public class simpleinterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a principal ammount: ");
        int p = sc.nextInt();

        System.out.println("enter a rate of interest : ");
        int r = sc.nextInt();

        System.out.println("enter a time: ");
        int t = sc.nextInt();

        int SI = p*r*t/100;

        System.out.println("Simple Interest: "+SI);

    }
    
    
}
