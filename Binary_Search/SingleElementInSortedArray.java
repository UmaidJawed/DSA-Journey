package Binary_Search;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1, high = n - 2;

        if (n == 1)
            return nums[0];

        if (nums[0] != nums[1])
            return nums[0];

        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if (nums[mid] != nums[prev] && nums[mid] != nums[next]) {
                return nums[mid];
            }

            // Checking for left-portion
            if ((mid % 2 == 1 && nums[prev] == nums[mid]) || (mid % 2 == 0 && nums[mid] == nums[next])) {
                low = mid + 1;
            }

            // Checking for right-portion
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
