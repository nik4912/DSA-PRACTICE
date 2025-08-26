import java.util.*;
public class majorityelements {
    public static int majority(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        int candidate = arr[n/2];
        int count =0;
        for (int i =0; i < n; i++) {
            if(arr[i] == candidate){
                count++;
            }
            
        }

        return (count > n / 2) ? candidate : -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 3, 4, 2, 3, 3, 3};

        System.out.println(majority(arr));
    }
    
}
