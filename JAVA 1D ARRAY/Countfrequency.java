public class Countfrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] freq = new int[arr.length]; // to store frequencies
        boolean[] visited = new boolean[arr.length]; // to mark visited elements

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) // skip already counted
                continue;

            int count = 1; // current element occurs at least once

            // compare with remaining elements
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // mark duplicate
                    count++;
                }
            }

            freq[i] = count; // store frequency
        }

        // display results
        System.out.println("Element | Frequency");
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) { // only print unique elements
                System.out.println(arr[i] + "       | " + freq[i]);
            }
        }
    }
}
