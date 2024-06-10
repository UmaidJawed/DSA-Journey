package Arrays;

import java.util.Map;
import java.util.TreeMap;

public class Count_Frequency {
    public static void frequencyCount(int arr[], int n, int p) {
        n = arr.length;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = map.getOrDefault(i, 0);
        }

    }
}
