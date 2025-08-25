import java.util.*;
public class leftrotate {
    public static void leftrotation(int[] arr){
        int n= arr.length;
        int first = arr[0];

        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = first;
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
       leftrotation(arr);
       System.out.print("the rotated array: ");
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
       

    }
         
}
