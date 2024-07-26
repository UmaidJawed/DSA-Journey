package Binary_Search;

public class Search_In_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;

            // Checking if left is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            // Checking if right is sorted
            else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                }

                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
