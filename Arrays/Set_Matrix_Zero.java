public class Set_Matrix_Zero {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean mat[][] = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0)
                    mat[i][j] = true;

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0 && mat[i][j] == true) {
                    // Setting all the rows to 0s.
                    for (int x = 0; x < col; x++) {
                        matrix[i][x] = 0;
                    }

                    for (int y = 0; y < row; y++) {
                        matrix[y][j] = 0;
                    }
                }
            }
        }

    }
}
