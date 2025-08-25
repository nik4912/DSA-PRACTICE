import java.util.*;

public class halfsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort first half (ascending)
        Arrays.sort(arr, 0, n / 2);

        // Sort second half (descending)
        Arrays.sort(arr, n / 2, n);
        reverse(arr, n / 2, n - 1);

        // Output result
        System.out.println("Modified array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Helper function to reverse part of the array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
