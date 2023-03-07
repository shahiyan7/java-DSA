package Problems.com;

import java.util.Scanner;

public class SumValues {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of an array: ");
        int size = in.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the Elements of array: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        int sum = 0;
        int sum2=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        System.out.print("The of Elements of array is: ");
        System.out.println(sum);
    }
}
