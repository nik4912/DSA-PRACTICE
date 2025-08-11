import java.util.*;

public class largest {
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
        int max = arr[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
            
        }
        System.out.println("the largest is: "+max);

    }
    
}
