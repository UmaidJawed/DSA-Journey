package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindLuckyNumberInMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        List<Integer> rowMin = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            int rMin = Integer.MAX_VALUE;
            for (int j = 0; j < col; j++) {
                rMin = Math.min(rMin, matrix[i][j]);
            }
            rowMin.add(rMin);
        }

        List<Integer> colMax = new ArrayList<>();
        for (int i = 0; i < col; i++) {
            int cMax = Integer.MIN_VALUE;
            for (int j = 0; j < row; j++) {
                cMax = Math.max(cMax, matrix[j][i]);
            }
            colMax.add(cMax);
        }

        List<Integer> luckyNumber = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == rowMin.get(i) && matrix[i][j] == colMax.get(j)) {
                    luckyNumber.add(matrix[i][j]);
                }
            }
        }

        return luckyNumber;
    }
}
