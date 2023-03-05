package assignment.com;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the num: ");
//       int num=in.nextInt();
//        System.out.println(ArmCheck(num));
        System.out.println("These are the 3 digit Armstrong num: ");
        for (int i = 100; i < 1000; i++) {
            if(ArmCheck(i)){
                System.out.println(i);
            }
        }
    }
    static boolean ArmCheck(int n){
        int sum=0;
        int updatedNum=n;
        while (updatedNum>0){
            int rem=updatedNum%10;
            int cube=rem*rem*rem;
             sum+=cube;
             updatedNum=updatedNum/10;
//            System.out.println(sum);
        }
        if(sum==n){
            return true;
        }
        else {
            return false;
        }
    }
}
