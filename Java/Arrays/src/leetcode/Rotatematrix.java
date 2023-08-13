package leetcode;

import java.util.Arrays;

public class Rotatematrix {
    public static void main(String[] args) {
        int[][] matrix={{0,0,0},{0,1,0},{1,1,1}};
        int[][] roatatedMatrix=new int[3][3];
        rotatedMatriX(matrix,roatatedMatrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(roatatedMatrix[i]));
        }
    }
    static void rotatedMatriX(int[][] matrix,int[][] rotatedMatrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rotatedMatrix[i][j]= matrix[(matrix.length-1)-j][i];
            }
        }
    }
}
