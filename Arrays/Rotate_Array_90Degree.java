package Arrays;

public class Rotate_Array_90Degree {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                Swap(matrix, i, j);
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                swap(matrix, i, left, right);
                left++;
                right--;
            }
        }

    }

    // Tranpose matrix approach
    static void Swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    // Reversing the matrix after tranpose
    static void swap(int arr[][], int i, int left, int right) {
        int temp = arr[i][left];
        arr[i][left] = arr[i][right];
        arr[i][right] = temp;
    }
}
