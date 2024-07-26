package Binary_Search;

public class FindMinimum_In_Rotated_SortedArray {
    public int findMin(int[] nums) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if (nums[low] <= nums[high]) {
                return nums[low];
            }

            if (nums[mid] <= nums[prev] && nums[mid] <= nums[next]) {
                return nums[mid];
            }

            if (nums[low] <= nums[mid]) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
