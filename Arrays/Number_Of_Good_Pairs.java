package Arrays;

public class Number_Of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (i < j) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
