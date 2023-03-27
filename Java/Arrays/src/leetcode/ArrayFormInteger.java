package leetcode;

import java.util.Arrays;

public class ArrayFormInteger {
    public static void main(String[] args) {
        int num= 3241;
        int k=32;
        String number=String.valueOf(num);
        int[] arrayform=new int[number.length()];
        for (int i = 0; i <number.length() ; i++) {
            int entry=Integer.parseInt(String.valueOf(number.charAt(i)));
          arrayform[i]=entry+k;
        }
        System.out.println(Arrays.toString(arrayform));
    }
}
