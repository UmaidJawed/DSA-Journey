package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        // Initializing the pointer required for traversing thorugh the matrix
        int n = matrix.length;// no.of rows
        int m = matrix[0].length;// no.of coloumns

        int top = 0, bottom = n - 1;// for row pointer
        int left = 0, right = m - 1;// for coloumn pointer

        // Loop until all the elements are traversed
        while (top <= bottom && left <= right) {

            // for moving left -> right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // for moving top->bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // for moving right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // for moving bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }

        }
        return ans;
    }
}
