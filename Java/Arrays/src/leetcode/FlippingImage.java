package leetcode;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        flipHorizontally(image);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j]==1){
                    image[i][j]=0;
                }
                else {
                    image[i][j]=1;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(image[i]));
        }

    }
    static  void flipHorizontally(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int n= arr[i].length;
            for (int j = 0; j <n/2; j++) {
               int temp= arr[i][j];
               arr[i][j]=arr[i][n-1-j];
               arr[i][n-1-j]=temp;

            }
        }


    }
}
