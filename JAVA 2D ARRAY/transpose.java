import java.util.*;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a row: ");
        int n = sc.nextInt();
        System.out.print("enter a Column: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        System.out.println("enter a element: ");
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("transpose matrix: ");

        for(int i=0; i<m; i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }





    }

    
}
