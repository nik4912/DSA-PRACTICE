import java.util.Arrays;

public class repeating {
    public static void findRepeating(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
                // Skip all duplicates to avoid printing same element multiple times
                while (i < n && arr[i] == arr[i - 1]) i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,2,6,7,3};
        findRepeating(arr); // Output: 1 3 6
    }
}
