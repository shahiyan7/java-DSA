package leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int ans=removeDuplicates(nums);
        System.out.println(ans);

    }

   static public int removeDuplicates(int[] nums) {
       Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
       System.out.println(set);
        return set.size();
    }
}


