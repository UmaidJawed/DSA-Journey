package Arrays;

public class Transpose_Of_Matrix {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int arr[][] = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[j][i] = matrix[i][j];

            }
        }
        return arr;
    }
}
