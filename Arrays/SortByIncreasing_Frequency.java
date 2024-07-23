package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByIncreasing_Frequency {
    class Solution {
        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int n = nums.length;
            int index = 0;

            for (int i = 0; i < n; i++) {
                int element = nums[i];
                map.put(element, map.getOrDefault(element, 0) + 1);

            }

            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }

            Collections.sort(list, (a, b) -> {
                int freqA = map.get(a);
                int freqB = map.get(b);

                if (freqA != freqB) {
                    return freqA - freqB;
                }

                else {
                    return b - a;
                }
            });

            for (int i = 0; i < n; i++) {
                nums[i] = list.get(i);
            }

            return nums;
        }
    }
}
