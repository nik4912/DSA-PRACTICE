import java.util.*;
public class secondlarge {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row: ");
        int n = sc.nextInt();
        System.out.println("enter a column: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("enter a element: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        int max = arr[0][0];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>max){
                max = arr[i][j];
            }
            }
            
        }
        int smax = -1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(max != arr[i][j] && smax<arr[i][j]){
                smax = arr[i][j];
            }
            }
            
        }
        System.out.println("second large: "+smax);
        
    }
    
}
