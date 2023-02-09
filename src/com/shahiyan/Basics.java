package com.shahiyan;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Enter the temp in celcius: ");
        Scanner in=new Scanner(System.in);
        int tempC= in.nextInt();
        float tempF=(tempC*9/5)+32;
        System.out.println(tempF);
    }
}
