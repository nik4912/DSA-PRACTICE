import java.util.*;

public class singleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        if(arr.length == 1){
            System.out.print("elements are single");
        }
        else{
            System.out.print("elements are not single");
        }
    
}
}
