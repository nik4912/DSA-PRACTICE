public class removeduplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // found a new unique element
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // new length of array without duplicates
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5};
        int newLength = removeDuplicates(nums);

        System.out.println("New length: " + newLength);
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
