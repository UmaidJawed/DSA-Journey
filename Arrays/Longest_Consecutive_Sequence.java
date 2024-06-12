package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 1;
        Set<Integer> set = new HashSet<>();

        if (n == 0)
            return 0;

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for (int trav : set) {
            if (!set.contains(trav - 1)) {
                int count = 1;
                int x = trav;

                while (set.contains(x + 1)) {
                    count++;
                    x++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
