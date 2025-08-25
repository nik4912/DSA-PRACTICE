
import java.util.*;

public class diffevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print evens
        int evensum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evensum += arr[i];
            }
        }

        // Print odds
        int oddsum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddsum += arr[i];
            }
        }

        int diff = evensum - oddsum;
        System.out.print("the diff is: "+diff);
    }
}
