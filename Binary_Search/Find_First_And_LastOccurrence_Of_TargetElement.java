package Binary_Search;

public class Find_First_And_LastOccurrence_Of_TargetElement {

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = First(nums, n, target);
        int last = Last(nums, n, target);
        return new int[] { first, last };
    }

    public static int First(int nums[], int n, int target) {
        n = nums.length;
        int first = -1;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }

            else if (nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int Last(int nums[], int n, int target) {
        n = nums.length;
        int last = -1;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            }

            else if (nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
        return last;
    }
}