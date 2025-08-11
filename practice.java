import java.util.*;
public class practice{
    public static int duplicate(int arr[]){
        boolean isduplicate = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("duplicate");
            }
            else{
                System.out.println("not duplicate: ");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size: ");
        int t = sc.nextInt();
        int arr[] = new int [t];
        System.out.println("enter a elemnt of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        duplicate(arr);
    }

}