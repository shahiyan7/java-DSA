package com.shahiyan;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        System.out.println("enter current year of college ");
        Scanner input=new Scanner(System.in);
        Scanner nameInput =new Scanner(System.in);
        int year=input.nextInt();
        System.out.println(year);
        System.out.println("enter you name ");
        String name=nameInput.nextLine();

        System.out.println(name);
    }
}
