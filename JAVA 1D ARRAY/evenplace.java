import java.util.*;
public class evenplace {
    public static int even(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter a element of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        even(arr);
        
    }

}
