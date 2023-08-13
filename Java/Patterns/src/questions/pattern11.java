package questions;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        pattern(num);
    }
    public static void pattern(int n){
        for (int i = 0; i <n ; i++) {
            for (Character j = 'A'; j <='A'+i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
