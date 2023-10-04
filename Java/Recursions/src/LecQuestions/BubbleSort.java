package LecQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int[] arr, int i,int j){
       if(i== 0){
           return;
       }
       if(j<i){
           if(arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
           }
           BubbleSort(arr,i,j+1);
       }
       else{
           BubbleSort(arr,i-1,1);
       }
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        BubbleSort(arr, arr.length, 1);
        System.out.println(Arrays.toString(arr));
    }
}
