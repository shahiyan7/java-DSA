package arrays;

import java.util.ArrayList;

public class LinearUsingList {
    public static ArrayList<Integer> LinearSearch(int[] arr,int target,ArrayList list,int index){
        if (index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return LinearSearch(arr,target,list,index+1);
    }

    public static ArrayList<Integer> finsAll2(int[] arr,int target,int index){
        ArrayList list =new ArrayList<>();
        if (index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList ansformBelowCalls=finsAll2(arr,target,index+1);
        list.addAll(ansformBelowCalls);
        return list;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,4,6,7};
        ArrayList<Integer> list=new ArrayList<>();
//        ArrayList<Integer> ans= LinearSearch(arr,2,list,0);
        ArrayList<Integer> ans2=finsAll2(arr,2,0);
//        System.out.println(ans);
        System.out.println(ans2);
    }
}
