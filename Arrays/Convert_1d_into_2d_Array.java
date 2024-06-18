package Arrays;

import java.util.Arrays;

public class Convert_1d_into_2d_Array {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size = original.length;
        int arr[][] = new int[m][];
        // int index = 0;

        if (m * n != size)
            return new int[0][0];
        int i = 0;
        for (int k = 0; i < m; k += n) {
            arr[i++] = Arrays.copyOfRange(original, k, k + n);
        }

        return arr;
    }
}
