import java.util.*;
public class rightrotation {
    public static void rightrotate(int[] arr){
        int n= arr.length;
        int last = arr[n-1];

        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a size of array: ");
       int t = sc.nextInt();
       int arr[] = new int[t];
       System.out.println("enter a element: ");
       for(int i=0;i<arr.length;i++){
         arr[i] = sc.nextInt();
       }
       rightrotate(arr);
       System.out.print("the rotated array: ");
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
       

    }
         
}
