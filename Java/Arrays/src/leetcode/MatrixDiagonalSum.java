package leetcode;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int ans=sum(matrix);
        System.out.println(ans);
    }
    static int sum(int[][] matrix){
        int sum=0;
        int k=matrix[0].length-1;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if(i==j){
                    sum=sum+matrix[i][j];
                }
                if(j==k && j!=i){
                    sum=sum+matrix[i][j];
                    k--;
                }

            }

        }
        return sum;
    }
}
