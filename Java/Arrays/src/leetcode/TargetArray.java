package leetcode;

import java.util.ArrayList;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,0};
        int[] index={0,1,2,3,0};
        ArrayList<Integer> target= new ArrayList<>(5);
        for (int i = 0; i < index.length; i++) {
           target.add(index[i],nums[i] );
        }
        System.out.println(target);
    }
}
