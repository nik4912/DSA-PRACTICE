import java.util.*;

public class diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n x n): ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        System.out.print("Main Diagonal: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i][i] + " ");

        System.out.println();

        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i][n - 1 - i] + " ");

        sc.close();
    }
}
