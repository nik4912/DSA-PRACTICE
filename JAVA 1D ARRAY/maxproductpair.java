import java.util.*;

public class maxproductpair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // If less than 2 elements, no pair exists
        if (n < 2) {
            System.out.println("No pair exists.");
            return;
        }

        int maxProduct = Integer.MIN_VALUE;
        int a = 0, b = 0; // To store the pair

        // Brute-force O(n^2) to find max product pair
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = arr[i] * arr[j];
                if (product > maxProduct) {
                    maxProduct = product;
                    a = arr[i];
                    b = arr[j];
                }
            }
        }

        System.out.println("Maximum product pair is: (" + a + ", " + b + ")");
        System.out.println("Maximum product: " + maxProduct);
    }
}
