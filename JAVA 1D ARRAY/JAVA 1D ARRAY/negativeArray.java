import java.util.*;

public class negativeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
       boolean allNegative = true ;
       for (int i = 0; i < n; i++) {
        if( arr[i] >= 0){
            allNegative = false;
            break;

        }
           
       }
       System.out.println(allNegative ? "All elements are negative" : "Not all elements are negative");
}
}
