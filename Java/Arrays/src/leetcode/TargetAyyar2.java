package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class TargetAyyar2 {
    public static void main(String[] args) {
     //  method-2 without arraylist concept
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int[] nums=new int[size];
        int[] index=new int[size];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < size; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println("Enter the element of index: ");
        for (int i = 0; i < size; i++) {
            index[i]=in.nextInt();
        }
        int[] res=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(index[i]==i){
                res[index[i]]=nums[i];
            }
            else {
                for (int j = i; j >index[i]; j--) {
                    res[j]=res[j-1];
                }
                res[index[i]]=nums[i];
            }

        }
        System.out.println(Arrays.toString(res));
    }
}
