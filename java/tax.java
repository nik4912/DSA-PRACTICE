import java.util.*;
public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a amount: ");
        double amount = sc.nextDouble();

        if(amount<500000.00){
            System.out.println("no tax");
            System.out.print(amount);
        }
        else if (amount>500000.00 && amount<1000000.00) {
            System.out.println("tax is 5%");
            double tax = amount*0.20;
            double cost = amount - tax;
            System.out.println("the tax is: "+tax);
            System.out.print("the cost is: "+cost);
        }
        else{
            System.out.println("the tax is 30%");
            double tax = amount*0.30;
            double cost = amount - tax;
            System.out.println("the tax is: "+tax);
            System.out.print("the cost is: "+cost);
        }


    }
    
}
