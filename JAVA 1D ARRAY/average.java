import java.util.*;
public class average {
    public static double average(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = (double)sum / n;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array: ");
        int t = sc.nextInt();
        int arr[] = new int[t];
        System.out.println("enter a element array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        double idx = average(arr);

        System.out.println("the average: "+idx);





    }
}
