package lecture;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr=new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Method 1 of printing");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Method 2");
        for(int j:arr){
            System.out.print(j +" ");
        }
        System.out.println();
        System.out.println("Method 3");
        System.out.println(Arrays.toString(arr));
    }
}
