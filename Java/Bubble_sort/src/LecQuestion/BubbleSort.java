package LecQuestion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        int searchIndex= arr.length-1;
        for (int j = 0; j < arr.length-1 ; j++) {
            for (int i = 0; i < searchIndex; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }

            }
            searchIndex--;
        }

        System.out.println(Arrays.toString(arr));
    }

}
