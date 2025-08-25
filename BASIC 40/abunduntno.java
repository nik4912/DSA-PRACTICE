import java.util.*;

public class abunduntno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        // Calculate sum of proper divisors (exclude n itself)
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // Check for abundance
        if (sum > n) {
            System.out.println(n + " is an Abundant Number.");
        } else {
            System.out.println(n + " is NOT an Abundant Number.");
        }
    }
}
