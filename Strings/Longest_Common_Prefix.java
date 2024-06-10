package Strings;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        String lPrefix = strs[0];
        int n = strs.length;
        for (int i = 1; i < n; i++) {
            while (strs[i].indexOf(lPrefix) != 0) {
                lPrefix = lPrefix.substring(0, lPrefix.length() - 1);
            }
        }
        return lPrefix;
    }
}
