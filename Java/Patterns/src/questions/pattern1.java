package questions;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=in.nextInt();
        pattern(num);
    }
   static public void pattern(int n){
       for (int i = 0; i <n ; i++) {
           for (int j = 0; j <n ; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}
