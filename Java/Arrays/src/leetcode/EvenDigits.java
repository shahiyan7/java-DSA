package leetcode;

import java.util.ArrayList;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        ArrayList<Integer> Evendigits=new ArrayList<>();
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            String num= String.valueOf(nums[i]);
            int length=num.length();
            if (length%2==0){
                Evendigits.add(nums[i]);
                count++;
            }
        }
        System.out.print("There are only "+count+" numbers which have Even digit: ");
        System.out.println(Evendigits);
    }
}
