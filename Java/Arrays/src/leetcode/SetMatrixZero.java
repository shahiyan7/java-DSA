package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
        int[] row= new int[arr.length];
        int[] col= new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==0){
                    row[i]=-100;
                    col[j]=-100;
                }
            }
        }
//    for row to make 0
        for (int i = 0; i < arr.length; i++) {
            if(row[i]==-100){
                for (int j = 0; j < arr[i].length; j++) {
                     arr[i][j]=0;
                }
            }

        }
//        for column to make 0
        for (int j = 0; j < arr[0].length; j++) {
            if(col[j]==-100){
                for (int i = 0; i< arr.length; i++) {
                    arr[i][j]=0;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
