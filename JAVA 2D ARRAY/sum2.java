import java.util.*;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        int[][] sum = new int[n][m];

        // Input Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();

        // Input Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                B[i][j] = sc.nextInt();

        // Addition of Matrices
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                sum[i][j] = A[i][j] + B[i][j];

        // Output Result
        System.out.println("Sum of Matrix A and B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
