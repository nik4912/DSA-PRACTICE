import java.util.*;
public class areasquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a side of square: ");
        int s= sc.nextInt();

        int square = s*s;
        System.out.print("the area of square: "+square);
    }
    
}
