package LeetcodeQuestions;

import java.util.Arrays;

public class SumTraingle {
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5};
      PrintTraingle(arr, arr.length-1);
    }
    public static void PrintTraingle(int[] arr,int size){
           if(size<1){
               return;
           }
            int[] tempArr= new int[size];
            for (int i = 0; i < size; i++) {
                tempArr[i]=arr[i]+arr[i+1];

            }

            PrintTraingle(tempArr,tempArr.length-1);
        System.out.println(Arrays.toString(tempArr));
        }


}
