import java.util.*;
public class roatationone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter element of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
     int last = arr[n-1];
     
     for(int i=n-1; i>0; i--){
         arr[i] = arr[i-1];
     }
     arr[0] = last;

     int first = arr[0];

     for(int i = 0; i<n-1;i++){
        arr[i] = arr[i+1];
     }
     arr[n-1] = first;



     // Print rotated array
     System.out.println("Rotated array: ");
     for(int i=0; i<n; i++){
         System.out.print(arr[i] + " ");
     }
     System.out.println();
}
}
