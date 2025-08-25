import java.util.Scanner;

public class sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count number of 0s
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        // Fill array: first 0s, then 1s
        for (int i = 0; i < n; i++) {
            if (i < zeroCount) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        // Output sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
