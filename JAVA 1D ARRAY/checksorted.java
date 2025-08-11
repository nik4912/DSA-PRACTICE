import java.util.*;

public class checksorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the elements: ");
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean isAsc = true;
        boolean isDesc = true;

        for(int i=1; i<n; i++){
            if (arr[i] > arr[i-1]){
                isDesc = false;
            }
            if (arr[i] < arr[i-1]){
                 isAsc = false;
            }
            
        }

        if (isAsc) {
            System.out.println("Array is in ascending order.");
        } else if (isDesc) {
            System.out.println("Array is in descending order.");
        } else {
            System.out.println("Array is not sorted.");
        }

    }
    
}
