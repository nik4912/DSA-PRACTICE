import java.util.*;
public class tripletproduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter a element of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a target: ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1 ;j++){
                for(int k=j+1;k<n;k++){
                if(arr[i]*arr[j]*arr[k]== target){
                    System.out.println("Triplet found: (" + arr[i] + ", " + arr[j] +", "+ arr[k] +")");
                    found = true;
                }
            }

        }
    }
            if(!found) {
            System.out.println("No doublets found with the given target.");
        }
        
    
    }
    
}