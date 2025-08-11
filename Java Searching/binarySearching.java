
public class binarySearching {
    public static int searching(int arr[], int target){
        int low =0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low +(high - low)/2;
            if(arr[mid]==target)
             return mid;
            else if(arr[mid] < target) 
            low = mid +1;
            else 
            high = mid -1;

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int target = 30;

        int idx = searching(arr, target);
        System.out.print(idx);
    }
    
}
