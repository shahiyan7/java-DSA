package com.assignment2.IntermediateProg;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int originalNum=in.nextInt();
        int updatedNum=originalNum;
        int size=String.valueOf(originalNum).length();
        int newNum=0;
        while(updatedNum!=0){
          int rem=updatedNum%10;
          int remCube= (int) Math.pow(rem,size);
           newNum+=remCube;
          updatedNum=updatedNum/10;
        }
        System.out.println(newNum);
       if (originalNum==newNum){
           System.out.println("The num is armstrong");
       }
       else{
           System.out.println("Not a armstrong number");
       }
    }
}
