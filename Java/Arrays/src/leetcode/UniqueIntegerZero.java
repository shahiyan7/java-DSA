package leetcode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UniqueIntegerZero {
    public static void main(String[] args) {
        int sum=0;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        Random random = new Random();
        for (int i = 0; i <n ; i++) {
            if(i==n-1){
                arr[i]=-sum;
                sum=sum+arr[i];
            }
            else{
                arr[i]= i;
                sum=sum+arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
