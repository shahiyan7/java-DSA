package Problems.com;

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr =new int[5];
        System.out.println("Enter the element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
       int maximum= Max(arr);
        System.out.println(maximum);
    }

    private static int Max(int[] arr) {
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
