
import java.util.*;

public class Binarysearch {
    
    public static int binary (int arr[], int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high-low)/2 ;
            if(arr[mid]==target) return mid;
            if(arr[mid] > target) 
            high = mid - 1;
            if(arr[mid] < target)
            low = mid +1;
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter a size of array: ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter a element: ");
        for(int i=0;i<n;i++){
            arr[i] = Sc.nextInt();
        }
        System.out.print("enter a target: ");
        int target = Sc.nextInt();

        int idx = binary(arr,target);
        System.out.print(idx);
        
    }
    
}
