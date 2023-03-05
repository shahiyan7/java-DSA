package assignment.com;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=in.nextInt();
       int factorial= Factorial(num);
        System.out.println(factorial);
    }
    static  int Factorial(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }
}
