package leetcode;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        ArrayList<Integer> ans=new ArrayList<>();
        Spiral(matrix,ans);
        System.out.println(ans);
    }

    public static void Spiral(int[][] matrix,ArrayList<Integer> Answer){
        int left=0 ,right=matrix[0].length-1;
        int top=0,bottom=matrix.length-1;
        while (top<=bottom && left<right){
            for (int i = left; i <=right ; i++) {
                Answer.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                Answer.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for (int i = right; i >=left ; i--) {
                    Answer.add(matrix[bottom][i]);
                }
                bottom--;
            }
         if (left<=right){
             for (int i = bottom; i >=top ; i--) {
                 Answer.add(matrix[i][left]);
             }
             left++;
         }

        }
    }
}
