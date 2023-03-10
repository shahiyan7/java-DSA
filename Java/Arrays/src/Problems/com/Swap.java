package Problems.com;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr;
        arr = new int[5];
        System.out.println("Enter the elments of array");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=in.nextInt();
        }
        Swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
   static void Swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=arr[index1];
    }
}
