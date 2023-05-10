package lecQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target: ");
        int target=in.nextInt();
      int ans=  BinarySearch(arr,target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        if(arr.length>1){
            int s=0;
            int e=arr.length-1;
               while ((s<=e)){
//                   int  m=s+e/2; not written in this beacuse may in large value case it may exceed the int range
                   int m=s+(e-s)/2;

                   if(target==arr[m]){
                       return m;
                   } else if (target>arr[m]) {
                       s=m+1;
                   }
                   else {
                       e=m-1;
                   }
               }


        }
       return -1;
    }
}
