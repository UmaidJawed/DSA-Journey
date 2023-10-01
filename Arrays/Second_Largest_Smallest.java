package Arrays;

import java.util.Arrays;
import java.util.*;

public class Second_Largest_Smallest {
    public static int[] getSecondOrderElements(int n, int[] a) {
        int max = a[0];
        int min = a[0];
        int[] arr = new int[2];
        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                arr[0] = a[n - 2];
            }
            if (a[i] == min) {
                arr[1] = a[1];
            }
        }

        return arr;
    }
}
