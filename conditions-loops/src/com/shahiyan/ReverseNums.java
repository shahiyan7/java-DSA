package com.shahiyan;

import java.util.Scanner;

public class ReverseNums {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String revNum="";
        while (n>0){
            int rem=n%10;
            revNum=revNum+rem;
            n=n/10;
        }
        System.out.println(revNum);
    }
}
