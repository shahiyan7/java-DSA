package com.shahiyan;

import java.util.Scanner;

public class CountingOcuurence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n=in.nextInt();
        System.out.print("Enter the target: ");
        int target=in.nextInt();
        int count=0;
        while(n>0){
           int r=n%10;
           if(r==target){
               count++;
           }
           n=n/10;
        }
        System.out.println(count);
    }
}
