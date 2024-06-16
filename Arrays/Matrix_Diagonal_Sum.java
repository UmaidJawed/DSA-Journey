package Arrays;

public class Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        int diagonalSum = 0;

        for (int i = 0; i < row; i++) {
            // Adding the primary diagonal
            diagonalSum += mat[i][i];

            // Adding the secondary diagonal and make sure when same element should not be
            // counted again
            if (i != row - 1 - i)
                diagonalSum += mat[i][row - 1 - i];
        }
        return diagonalSum;
    }
}
