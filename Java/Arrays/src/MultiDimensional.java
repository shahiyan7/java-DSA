import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6,10,11},
                {7,8,9}};


        for (int row = 0; row < arr.length ; row++) {
            System.out.print("[");
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(+arr[row][col]+",");
            }
            System.out.print("]");
            System.out.println("");
        }
    }
}
