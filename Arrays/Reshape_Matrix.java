public class Reshape_Matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if ((m * n) != (r * c))
            return mat;

        int arr[][] = new int[r][c];
        int row_index = 0;
        int column_index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[row_index][column_index] = mat[i][j];
                column_index++;

                if (column_index == c) {
                    column_index = 0;
                    row_index++;
                }
            }
        }

        return arr;
    }
}
