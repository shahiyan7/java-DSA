package SortingAlgorithms;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={9,2,6,1,8,4,3,7,5};
         CycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void CycleSort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
               Swap(i,correct,arr);
            }
            else {
                i++;
            }

        }
    }
    public static void Swap(int first, int second,int[] arr){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }







//    public static void CycleSort(int[] arr){
//        for (int i = 0; i < arr.length ; i++) {
//            int correct=arr[i]-1;
//            while (arr[i]!=arr[correct]){
//                int temp=arr[i];
//                arr[i]=arr[correct];
//                arr[correct]=temp;
//                correct=arr[i]-1;
//            }
//
//
//        }
//    }
}
