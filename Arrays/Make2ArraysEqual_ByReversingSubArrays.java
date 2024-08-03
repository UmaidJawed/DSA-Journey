package Arrays;

import java.util.*;

public class Make2ArraysEqual_ByReversingSubArrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = target.length;

        // Using HashMap Approach
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : target) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i]) || map.get(arr[i]) == 0) {
                return false;
            }
            map.put(arr[i], map.get(arr[i]) - 1);
        }

        return true;

        /*
         * Counting the no.of elelments and checking the each value after sorting it.
         * Arrays.sort(arr);
         * Arrays.sort(target);
         * int n = arr.length;
         * int count = 0;
         * 
         * for(int i = 0;i<n;i++)
         * {
         * if(arr[i] == target[i])
         * {
         * count++;
         * }
         * }
         * 
         * if(count == target.length)
         * return true;
         * 
         * return false;
         */
    }
}
