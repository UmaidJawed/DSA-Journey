package Arrays;

public class MinimumSwapReqtoGroup1sTogether {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOnes = 0;

        // Counting total no. of 1s
        for (int num : nums) {
            totalOnes += num;
        }

        // Edge Cases
        if (totalOnes == 0 || totalOnes == n)
            return 0;

        int currentOnes = 0;

        // Count 1's in the first window of size totalOnes
        for (int i = 0; i < totalOnes; i++) {
            currentOnes += nums[i];
        }

        int maxOnes = currentOnes;

        // Using 2-pointers for sliding windows concept
        for (int i = 0; i < n; i++) {
            currentOnes -= nums[i];
            currentOnes += nums[(i + totalOnes) % n];
            maxOnes = Math.max(maxOnes, currentOnes);
        }

        return totalOnes - maxOnes;
    }
}