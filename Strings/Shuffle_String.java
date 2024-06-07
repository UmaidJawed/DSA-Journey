package Strings;

public class Shuffle_String {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char shuffle[] = new char[n];

        for (int i = 0; i < n; i++) {
            shuffle[indices[i]] = s.charAt(i);
        }

        return new String(shuffle);
    }
}
