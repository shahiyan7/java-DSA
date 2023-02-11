package com.shahiyan;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char word=in.next().trim().charAt(0);
        if(word >='a'&& word<='z'){
            System.out.println("it is a lower case char");
    }
        else {
            System.out.println("it is a upper case char");
        }
    }

}
