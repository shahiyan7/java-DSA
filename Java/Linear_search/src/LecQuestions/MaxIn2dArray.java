package LecQuestions;

public class MaxIn2dArray {
    public static void main(String[] args) {
        int [][] arr={
                {1,22,34},
                {7,9,6},
                {55,22,4}
        };
        int ans=max(arr);
        System.out.println(ans);
    }
    static int max(int[][] arr){
        int maximum;
        maximum=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>maximum){
                    maximum=arr[i][j];
                }
            }

        }
        return maximum;
    }
}
