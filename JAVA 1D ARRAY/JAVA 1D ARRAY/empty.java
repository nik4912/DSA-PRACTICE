import java.util.*;

public class empty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(arr.length == 0){
            System.out.println("array empty");

        }
        else{
            System.out.println("not empty");
        }
    
}
}
