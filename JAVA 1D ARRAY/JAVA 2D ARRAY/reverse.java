import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row no: ");
        int n = sc.nextInt();
        System.out.println("enter a column: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the matrix is: ");
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
