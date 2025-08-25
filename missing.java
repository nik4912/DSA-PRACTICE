import java.util.*;

public class missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];
        System.out.println("Enter " + (n - 1) + " elements from 1 to " + n + " with one missing:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);  // Sort the array

        // Traverse and check for missing
        for (int i = 0; i < n - 2; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                System.out.println("Missing number is: " + (arr[i] + 1));
                return;
            }
        }

        // If missing number is last (n)
        if (arr[0] != 1) {
            System.out.println("Missing number is: 1");
        } else {
            System.out.println("Missing number is: " + n);
        }
    }
}
