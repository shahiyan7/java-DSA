package leetcode;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=in.nextInt();
        System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int n){
        for (int i = 1; i < n/2; i++) {
            int square=i*i;
            if(square==n){
                return true;
            }
        }
        return false;
    }

}
