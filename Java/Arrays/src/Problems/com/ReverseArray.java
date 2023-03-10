package Problems.com;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverse(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr,int start,int end){
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start=start+1;
            end=end-1;
        }
    }
}
