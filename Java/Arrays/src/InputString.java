import java.util.Arrays;
import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
//        System.out.print("Enter the size of array: ");
        Scanner in=new Scanner(System.in);
//        int size=in.nextInt();
        String[] arr=new String[4];
        System.out.println("Enter the strings");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=in.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}
