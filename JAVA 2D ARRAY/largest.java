import java.util.*;

public class largest {
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

        System.out.println("print matrix: ");
        
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                if(max <arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.print("largest element is: "+max);

    }
    
}