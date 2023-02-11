package com.assignment2.IntermediateProg;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=in.nextInt();
        int fact=1;
        for (int i = n; i >0 ; i--) {
            fact=fact*i;
        }
        System.out.println("The factorial of "+n+" is: "+fact);
    }
    }

