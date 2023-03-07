package Problems.com;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Size of an array: ");
        int size=in.nextInt();
        int[] arr=new int[size];
        int[] newarr=new int[arr.length-1];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the element you want to remove: ");
        int key= in.nextInt();
        removeElemet(arr,key);
        for (int i = 0; i < newarr.length; i++) {
            newarr[i]=arr[i];
        }
        System.out.println("After removing the element");
        System.out.println(Arrays.toString(newarr));
    }
    static void removeElemet(int[] arr,int x){
        int j;
        for ( j = 0; j < arr.length ; j++) {
            if(arr[j]==x){
                break;
            }

        }
        if(j< arr.length){
            for (int i = j; i < (arr.length)-1 ; i++) {
                arr[i]=arr[i+1];
            }
        }
//        System.out.println(Arrays.toString(arr));
    }
}
