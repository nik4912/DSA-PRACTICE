import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter element of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=n-1 ;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
