package Arrays;

import java.util.HashMap;
import java.util.Map;

//Using Map data structure which is the part of the collection framework in java.

public class Single_Number {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> arr = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = arr.getOrDefault(nums[i], 0);
            arr.put(nums[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> mpp : arr.entrySet()) {
            if (mpp.getValue() == 1)
                return mpp.getKey();
        }

        return -1;
    }
}
