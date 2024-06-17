package Arrays;

public class Cells_with_Odd_Values_in_a_Matrix {
    public int oddCells(int m, int n, int[][] indices) {
        int nums[][] = new int[m][n];
        int count = 0;

        for (int num[] : indices) {
            int row = num[0];
            int column = num[1];

            // Incrementing the rows
            for (int j = 0; j < n; j++) {
                nums[row][j]++;
            }

            // Incrementing all cell in the column
            for (int i = 0; i < m; i++) {
                nums[i][column]++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
