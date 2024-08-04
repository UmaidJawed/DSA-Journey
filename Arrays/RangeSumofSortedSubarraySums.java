package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class RangeSumofSortedSubarraySums {

    public int rangeSum(int[] nums, int n, int left, int right) {
        n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        long modulus = 1000000007L;
        long result = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);

        for (int i = left; i <= right; i++) {
            result = (result + list.get(i - 1)) % modulus;
        }

        return (int) result;

    }
}