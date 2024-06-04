package Arrays;

import java.util.*;

class Subarray_Sum_EqualsTo_K {

    // This is the brute-force approach:

    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        // int right = 0,left = 0;
        int sum = 0;

        for (int left = 0; left < n; left++) {
            sum = 0;

            for (int right = left; right < n; right++) {
                sum += nums[right];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}