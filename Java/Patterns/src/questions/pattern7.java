package questions;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        for (int i = 0; i < 2*n+1; i++) {
            int star=i;
            if(i>n){
                star=2*n-i;
            }
            for (int j = 0; j <star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
