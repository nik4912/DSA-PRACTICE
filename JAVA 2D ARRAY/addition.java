import java.util.*;

public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a row: ");
        int n = sc.nextInt();
        System.out.print("enter a Column: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        int mrr[][] = new int[n][m];
        int result [] [] = new int [n][m];

        System.out.println("enter a 1st element: ");
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter a 2nd element: ");
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                mrr[i][j] = sc.nextInt();
            }
        }

         System.out.println("enter a 2nd element: ");
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                result[i][j] = arr[i][j] + mrr[i][j];
            }
        }

        System.out.println("result matrix is : ");

        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }





        


    } 
}
