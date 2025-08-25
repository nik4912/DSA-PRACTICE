import java.util.*;
public class majorityelement {
    
    // public static int majority(int arr[], int n){
    //     // Assuming the majority element is at the middle after sorting
    //     return arr[arr.length / 2];
    // }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.err.print("enter a size of array: ");
       int n = sc.nextInt();
       int arr[] = new int[n];

       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       }

       Arrays.sort(arr);

       


        
    }
    
}
