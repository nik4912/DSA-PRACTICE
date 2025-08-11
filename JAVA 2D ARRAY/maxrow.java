import java.util.*;

public class maxrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        // Input matrix
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();

        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;

        // Find row with max sum
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum += arr[i][j];
            }

            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRow = i; // zero-based index
            }
        }

        // Output
        System.out.println("Row with maximum sum is: Row " + (maxRow + 1));
        System.out.println("Sum = " + maxSum);

        sc.close();
    }
}
