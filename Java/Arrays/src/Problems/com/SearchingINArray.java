package Problems.com;

import java.util.Scanner;

public class SearchingINArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=in.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the number you want to find: ");
        int key=in.nextInt();
        int i;
        for ( i = 0; i < arr.length; i++) {
            if(key==arr[i]) {
                System.out.println("Yes " + key + " present at index: " + i);
                break;
            }
        }
        if(i>= arr.length){
            System.out.println(key+" not present in the array");
        }
    }
}
