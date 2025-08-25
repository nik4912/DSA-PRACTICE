import java.util.*;
public class negative {
    public static int[] negativetozero(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i] = 0;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int t = sc.nextInt();
        int arr[] = new int[t];
        System.out.println("enter element of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] idx = negativetozero(arr);
        System.out.println("the new array: ");
        for(int i = 0; i < idx.length; i++) {
            System.out.print(idx[i] + " ");
        }
        System.out.println();

        
    }
    
}
