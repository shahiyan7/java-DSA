package leetcode;

//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//        Specifically, ans is the concatenation of two nums arrays.
//
//        Return the array ans.

import java.util.Arrays;
import java.util.Scanner;

public class concentration {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=in.nextInt();
        int[] nums=new int[n];
        int[] ans=new int[2*n];
        for (int i = 0; i <3 ; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i <3 ; i++) {
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }

}
