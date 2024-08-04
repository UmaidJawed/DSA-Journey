package Arrays;

public class DesignNeighborSumService {
    private int grid[][];
    private int n;

    public DesignNeighborSumService(int[][] grid) {
        this.grid = grid;
        this.n = grid.length;
    }

    public int adjacentSum(int value) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    if (i - 1 >= 0) {
                        sum += grid[i - 1][j];
                    }

                    if (i + 1 < n) {
                        sum += grid[i + 1][j];
                    }

                    if (j - 1 >= 0) {
                        sum += grid[i][j - 1];
                    }

                    if (j + 1 < n) {
                        sum += grid[i][j + 1];
                    }
                }
            }
        }
        return sum;
    }

    public int diagonalSum(int value) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == value) {
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        sum += grid[i - 1][j - 1];
                    }

                    if (i - 1 >= 0 && j + 1 < n) {
                        sum += grid[i - 1][j + 1];
                    }

                    if (i + 1 < n && j - 1 >= 0) {
                        sum += grid[i + 1][j - 1];
                    }

                    if (i + 1 < n && j + 1 < n) {
                        sum += grid[i + 1][j + 1];
                    }
                }
            }

        }
        return sum;
    }
}
