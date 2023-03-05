package com.shahiyan;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int salary=in.nextInt();
//        if (salary>10000){
//            salary+=2000;
//        }
//        else {
//            salary+=1000;
//        }
        if (salary>20000){
            salary+=3000;
        } else if (salary>10000) {
            salary+=2000;
        }
        else {
            salary+=1000;
        }
        System.out.println(salary);
    }
}