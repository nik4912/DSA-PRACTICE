import java.util.*;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a radius: ");
        int r = sc.nextInt();
        double pi = 3.14;
        double area = pi*r*r;

        System.out.print("area of circle: " +area);



    }
    
}
