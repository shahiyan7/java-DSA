package arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static int linearSearch(int[] arr,int target,int index){
        if (index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return  linearSearch(arr,target,index+1);
        }
    }

    static ArrayList list=new ArrayList<>();
    public static void findAllIndex(int[] arr,int target,int index){
        if (index==arr.length){
            return ;
        }
        if(arr[index]==target){
           list.add(index);
        }

            findAllIndex(arr,target,index+1);

    }
    public static void main(String[] args) {
        int[] arr = {1,3,3,5,7,9};
        int ans =linearSearch(arr,2,0);
        System.out.println(ans);
        findAllIndex(arr,2,0);
        System.out.println(list);
    }
}
