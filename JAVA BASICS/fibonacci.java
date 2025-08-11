import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int x = sc.nextInt();

        int t1 = 0, t2 = 1;

        if (x <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (x == 1) {
            System.out.println("Fibonacci Series: " + t1);
        } else {
            System.out.print("Fibonacci Series: " + t1 + ", " + t2);

            for (int i = 3; i <= x; i++) {
                int nextTerm = t1 + t2;
                System.out.print(", " + nextTerm);
                t1 = t2;
                t2 = nextTerm;
            }
            System.out.println();  
        }
    }
}
