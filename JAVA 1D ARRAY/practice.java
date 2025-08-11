import java.util.*;

public class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find minimum
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Find second minimum
        int smin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] != min && arr[i] < smin) {
                smin = arr[i];
            }
        }

        // Check if second minimum exists
        if (smin == Integer.MAX_VALUE) {
            System.out.println("No second minimum element found.");
        } else {
            System.out.println("Second minimum: " + smin);
        }
    }
}
