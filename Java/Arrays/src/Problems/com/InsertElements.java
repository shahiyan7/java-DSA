package Problems.com;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElements {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={1,2,3,4};
        arr[2]=5;
        System.out.println(Arrays.toString(arr));
    }
}
