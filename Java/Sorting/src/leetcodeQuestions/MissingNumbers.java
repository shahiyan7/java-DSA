package leetcodeQuestions;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr={1,2};
         Sort(arr);
        System.out.println(Arrays.toString(arr));
       int ans= Missing(arr);
        System.out.println(ans);

    }
    public static void Sort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i];
            if(correct< arr.length && arr[i]!=arr[correct]){
                Swap(i,correct,arr);
            }
            else
                i++;
            }
    }
        public static void Swap(int first, int second,int[] arr){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
        public static int Missing(int[] arr){
        int i=0;
        while (i<arr.length){
            if(i!=arr[i]){
                return i;
            }
            i++;
        }
        return i;
        }
}
