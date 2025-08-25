import java.util.*;
public class linear {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter a element of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = -1;
        System.out.println("enter a key: ");
        int key = sc.nextInt();
        for(int i=0;i< n;i++){
            if(arr[i]==key){
                ans = i;
                break;
                
            }
        }
         if(ans == -1){
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Key found at index: " + ans);
        }


    }

}