package Strings;

import java.util.Arrays;

public class MinimumNumberofPushes_toTypeWordII {
    public int minimumPushes(String word) {
        // Initializing the counts array
        int counts[] = new int[26];
        int n = counts.length;

        // Counting the frequency of each character in the word using ASCII characters
        for (char c : word.toCharArray()) {
            counts[c - 'a']++;
        }

        // Sorting the counts array in descending order
        Arrays.sort(counts);

        // Reversing the array to get it in descending order by taking the half of the
        // counts array length which will be used for swapping the element in the array
        // for reversing
        for (int i = 0; i < n / 2; i++) {
            int temp = counts[i];
            counts[i] = counts[n - 1 - i];
            counts[n - 1 - i] = temp;
        }

        // Now we are going to calculate the minimum pushes by traversing through the
        // counts array and then we will return it
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += counts[i] * (1 + i / 8);
        }

        return result;
    }
}
