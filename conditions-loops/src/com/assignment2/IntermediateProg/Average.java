package com.assignment2.IntermediateProg;

import java.util.Scanner;


public class Average {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the total no of numbers: ");
        float n= in.nextFloat();
        float sum=0;
        for (int i = 0; i < n; i++) {
            int numbs=in.nextInt();
            sum+=numbs;
        }
        float average=sum/n;
        System.out.println("The average is: "+average);
    }
}
