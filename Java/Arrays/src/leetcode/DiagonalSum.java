package leetcode;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int initialSum=0;
        int sum=PrimaryDiagonalSum(matrix2,initialSum)+SecondaryDiagonalSum(matrix2,initialSum);
        System.out.println(sum);
    }
    static int PrimaryDiagonalSum(int[][] arr,int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
    static int SecondaryDiagonalSum(int[][] arr,int sum){
        for (int i = 0; i < arr.length; i++) {
            int m= arr.length;
            for (int j = 0; j < arr[i].length; j++) {
                if(j==m-1-i){
                    if(i!=j){
                        sum=sum+arr[i][j];
                    }
                }
            }
        }
        return sum;
    }
}
