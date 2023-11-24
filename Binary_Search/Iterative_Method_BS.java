package Binary_Search;

import java.util.*;

public class Iterative_Method_BS {

    public static int search(int[] nums, int target) {
        int low = 0;
        int n = nums.length;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;

            else if (nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
