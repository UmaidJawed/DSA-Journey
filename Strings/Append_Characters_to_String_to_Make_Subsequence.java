package Strings;

public class Append_Characters_to_String_to_Make_Subsequence {
    public int appendCharacters(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0, j = 0;

        if (s.contains(t)) {
            return 0;
        }

        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return m - j;
    }
}
