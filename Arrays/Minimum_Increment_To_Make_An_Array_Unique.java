package Arrays;

import java.util.Arrays;

public class Minimum_Increment_To_Make_An_Array_Unique {

    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        int moves = 0;
        Arrays.sort(nums);
        if (nums == null || n == 0)
            return 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                moves += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return moves;
    }
}