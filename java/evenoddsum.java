import java.util.*;

public class evenoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 5, 3, 7, 8, 4, 21, 32, 10};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        System.out.println("The even sum: " + evenSum);
        System.out.println("The odd sum: " + oddSum);
    }
}
