package questions;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num= in.nextInt();
        pattern(num);
    }
    static public void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
