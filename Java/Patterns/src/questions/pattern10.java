package questions;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        pattern(num);
    }
    public static void pattern(int n){
        int k=1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
