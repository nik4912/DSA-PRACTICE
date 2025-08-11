import java.util.*;

public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPerfectSquare = false;

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(n + " is a Perfect Square.");
        } else {
            System.out.println(n + " is NOT a Perfect Square.");
        }
    }
}
