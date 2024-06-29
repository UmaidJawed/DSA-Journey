package Strings;

import java.util.HashSet;

public class NoOfString_AppearInSubstring1 {
    class Solution {
        public int numOfStrings(String[] patterns, String word) {
            int n = patterns.length;
            int m = word.length();
            int count = 0;

            HashSet<String> set = new HashSet<>();

            for (int i = 0; i < m; i++) {
                for (int j = i; j < m; j++) {
                    set.add(word.substring(i, j + 1));
                }
            }

            for (int i = 0; i < n; i++) {
                if (set.contains(patterns[i])) {
                    count++;
                }
            }

            return count;
        }
    }
}
