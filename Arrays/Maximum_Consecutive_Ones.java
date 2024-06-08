package Arrays;

public class Maximum_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxi = 0;
        int i = 0;

        while (i < n) {
            if (nums[i] == 1) {
                count++;

            } else {
                count = 0;
            }
            maxi = Math.max(maxi, count);
            i++;
        }
        return maxi;
    }
}
