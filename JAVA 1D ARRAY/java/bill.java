import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a no of pencil: ");
        double a = sc.nextDouble();

        System.out.print("enter a no of pen: ");
        double b = sc.nextDouble();

        System.out.print("enter a no of eraser: ");
        double c = sc.nextDouble();

        double pencil = 5.00;
        double pen = 10.00;
        double eraser = 3.00;

        double total = (a*pencil + b*pen + c*eraser );

        double tax = total *0.18;

        double cost = tax + total;

        System.out.println("the total amount is: "+total);
        System.out.println("the tax is: "+tax);
        System.out.println("the bill cost: "+cost);


    }
    
}
