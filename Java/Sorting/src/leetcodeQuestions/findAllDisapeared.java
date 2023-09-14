package leetcodeQuestions;

import SortingAlgorithms.CycleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class findAllDisapeared {
    public static void main(String[] args) {
        int[] nums={1};
        CyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> disappearedNumber=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                disappearedNumber.add(i+1);
            }
        }
        System.out.println(disappearedNumber);

    }
    public static void CyclicSort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if(correct<arr.length && arr[i]!=arr[correct]){
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
}
