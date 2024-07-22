package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortNames {

    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        int m = heights.length;

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        int index = 0;
        for (int i = m - 1; i >= 0; i--) {
            names[index++] = map.get(heights[i]);
        }

        return names;
    }
}