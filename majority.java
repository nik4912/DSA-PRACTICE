import java.util.*;

public class majority {
    public static int major(int arr[]) {
        int n = arr.length;

        
        Arrays.sort(arr);

        int candidate = arr[n / 2];

        int count = 0;
        for (int i =0; i<n; i++) {
            int num = arr[i];
            if (num == candidate) {
                count++;
            }
        }

        
        if (count > n / 2) {
            return candidate;
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int t = sc.nextInt();
        int[] arr = new int[t];

        System.out.println("Enter elements:");
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }

        int result = major(arr);
        if (result != -1) {
            System.out.println("Majority element is: " + result);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
