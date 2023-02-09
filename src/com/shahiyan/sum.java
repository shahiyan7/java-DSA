package com.shahiyan;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("enter the numbers ");
        Scanner input=new Scanner(System.in);
        float num1= input.nextInt();
        float num2= input.nextInt();
         float  sum=  (num1+num2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(sum);
    }
}
