import java.util.*;

public class allsame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean allsame = true;
        for (int i = 0; i < n; i++) {
            if(arr[i] != arr[0]){
                allsame = false;
                break;
            }
            
        }
        System.out.println(allsame ? "All elements are same" : "Not all elements are same");

    
}
}
