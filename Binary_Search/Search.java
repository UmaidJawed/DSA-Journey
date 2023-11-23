package Binary_Search;

import java.util.*;

public class Search {
    public static int binarysearch(int[] nums, int low, int high, int target) {
        if (low > high)
            return -1;// base case for recursion

        // main statement
        int mid = low + (high - low) / 2;
        if (nums[mid] == target)
            return mid;

        else if (nums[mid] < target)
            return binarysearch(nums, mid + 1, high, target);

        else
            return binarysearch(nums, low, mid - 1, target);
    }

    public static int search(int[] nums, int target) {
        return binarysearch(nums, 0, nums.length - 1, target);
    }
}
