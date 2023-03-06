import java.util.Arrays;
import java.util.Scanner;

public class Input2DArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println(arr.length);
        System.out.println("Enter the Elements: ");

//        Input
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]=in.nextInt();
            }
        }
//        output method-1
        System.out.println("Method 1 of printing ");
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println("");
        }
//           method-2
        System.out.println("Method 2 of printing");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
//        method-3 of printing
        System.out.println("Method 3 of printing ");
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }

}
