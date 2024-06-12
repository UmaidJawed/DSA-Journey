package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Relative_Sort_Array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequencies of elements in arr1
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Sort elements of arr1 based on the order in arr2
        for (int num : arr2) {
            int frequency = map.getOrDefault(num, 0);
            while (frequency > 0) {
                arr1[index++] = num;
                frequency--;
            }
            map.remove(num);
        }

        // Add remaining elements in arr1 in ascending order
        List<Integer> remain = new ArrayList<>();
        for (int num : map.keySet()) {
            int frequency = map.get(num);
            while (frequency > 0) {
                remain.add(num);
                frequency--;
            }
        }

        // Sort remaining elements
        Collections.sort(remain);

        // Add remaining elements to arr1
        for (int num : remain) {
            arr1[index++] = num;
        }

        return arr1;
    }
}
