import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter a element of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean isDuplicate= false;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                System.out.println("duplicate");
                isDuplicate = true;
            }
            
        }
        if(!isDuplicate) {
            System.out.println("No duplicates found.");
        }
    
    }
    
}
