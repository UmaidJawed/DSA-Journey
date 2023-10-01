package Arrays;

import java.util.*;
import java.io.*;

public class Largest_Element {
    static int largestElement(int[] arr, int n) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
}
