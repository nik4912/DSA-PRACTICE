import java.util.*;

public class Main {
    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1]; // Store last element

        // Shift all elements one step to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last; // Put last element at the first position
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rotateByOne(arr);

        System.out.print("Array after rotating by one: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
