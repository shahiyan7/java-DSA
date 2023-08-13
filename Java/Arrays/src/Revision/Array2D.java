package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of rows in the array: ");
        int rows=in.nextInt();
        int[][] myarr=new int[rows][];
        InputArray(myarr);

    }

    static  void InputArray(int[][] arr){
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number of column you want for row "+i+": ");
            int column=in.nextInt();
            arr[i] = new int[column];
            for (int j = 0; j < column; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        prinArray(arr);
    }
    static void prinArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
