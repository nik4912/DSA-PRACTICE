import java.util.*;
public class missing1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter th size array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int totalsum = n*(n+1)/2;

        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum =0;
        for(int i=0; i<n-1; i++){
            sum += arr[i];
        }

        int rem = totalsum - sum;

        System.out.print("missing no: "+rem);

        
    }
    
}
