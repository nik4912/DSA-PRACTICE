import java.util.*;
public class sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter a size of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        System.out.println("sum of array: "+sum);
    }
    
}
