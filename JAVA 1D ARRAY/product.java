import java.util.*;
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter a element of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int prd =1;
        for(int i=0;i<n;i++){
            prd *=arr[i];
        }
        System.out.println("product of array: "+prd);
    }
    
}
