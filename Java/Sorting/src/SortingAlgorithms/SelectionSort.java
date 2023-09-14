package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int max=Maximum(arr, arr.length-1-i);
             int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[max];
            arr[max]=temp;

        }
    }

    public static int Maximum(int[] arr,int end) {
        int max = 0;
        int maxIndex=0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
