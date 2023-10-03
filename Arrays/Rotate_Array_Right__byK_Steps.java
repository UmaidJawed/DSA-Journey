package Arrays;

public class Rotate_Array_Right__byK_Steps {
    public int[] rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return nums;
        }

        k = k % n;

        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - n + k] = nums[i];
        }

        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

        return nums;
    }
}