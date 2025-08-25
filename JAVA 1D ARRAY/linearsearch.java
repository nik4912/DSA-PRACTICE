import java.util.*;
public class linearsearch {
    public static int search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
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
        System.out.println("enter a key: ");
        int key = sc.nextInt();
        int index = search(arr, key);
        if(index == -1){
            System.out.println("not found");
        }
        else {
            System.out.println("Found: "+index);
        }

    }

}