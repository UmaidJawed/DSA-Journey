package Binary_Search;

//This question : Search_In_Rotated_Sorted_Array2 is for non-distinct values 
//where the condition can be such that : nums[low] == nums[mid] == nums[high]
//So,how to encounter this I have used the special condition inorder shrink the size of the search space whenever we met the above condition..

public class Search_In_Rotated_Sorted_Array2 {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }

            // For the repeating elements in which low,mid and high element all are equal
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;// we are skipping the iteration if we encounter the same element and instead of
                         // doing the same iteration again and again we should skip it and just shrink
                         // the size of the search space.
            }

            // left-sorted part
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                }

                else {
                    low = mid + 1;
                }
            }

            // right-sorted part
            else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                }

                else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}
