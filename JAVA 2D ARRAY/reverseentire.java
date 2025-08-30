import java.util.*;

public class reverseentire {
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

        System.out.println("reverse matrix: ");

        for(int i=n-1; i>=0; i--){
            for(int j=m-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
