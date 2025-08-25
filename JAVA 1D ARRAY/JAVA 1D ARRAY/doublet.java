import java.util.*;
public class doublet {
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
        int count =0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1 ;j++){
                if(arr[i]+arr[j]== target){
                    // System.out.println("Doublet found: (" + arr[i] + ", " + arr[j] + ")");
                    // found = true;
                    count++;
                }
            }

        //     if(!found) {
        //     System.out.println("No doublets found with the given target.");
        
         }
         System.out.print("count is:"+ count);
        }
    
    }
    

