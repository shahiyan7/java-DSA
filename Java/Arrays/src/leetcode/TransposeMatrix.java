package leetcode;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transpose = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(transpose[i]));

        }

    }
}
