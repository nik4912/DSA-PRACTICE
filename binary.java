import java.util.*;
public class binary {
    public static int searching(int[] arr, int target){
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter a elements: ");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
         Arrays.sort(arr);
        System.out.println("enter a target: ");
        int target = sc.nextInt();
        int index = searching(arr,target);
        if(index == -1 ){
            System.out.println("not found");
        }
        else{
            System.out.println("found: "+index);
        }
    }
    
}
