package Arrays;

public class Next_Permutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        int start = 0, end = n - 1;
        // Finding the Dip and assigning the value to the index
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // if index value remain -1
        if (index == -1) {
            reverseArray(nums, start, end);
            return;
        }

        // Swapping dip number with the next largest number but not much further
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }

        }
        // Reverse the remanig element in sorted order from index+1 till n-1
        reverseArray(nums, index + 1, end);
    }

    static void reverseArray(int nums[], int start, int end) {
        if (start >= end)
            return;

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        reverseArray(nums, start + 1, end - 1);
    }
}
