package DSA;
//https://leetcode.com/problems/diagonal-traverse/submissions/
import java.util.Arrays;

public class DiagonalTraverse {

    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0, dir = 1, idx = 0;

        while (idx < m * n) {
            result[idx++] = mat[row][col];

            if (dir == 1) {
                if (col == n - 1) {
                    row++;
                    dir = -1;
                } else if (row == 0) {
                    col++;
                    dir = -1;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    col++;
                    dir = 1;
                } else if (col == 0) {
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result = findDiagonalOrder(mat);
        System.out.println("Diagonal Traversal: " + Arrays.toString(result));
    }
}
