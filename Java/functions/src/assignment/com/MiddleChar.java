package assignment.com;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=in.next();
        middleCharacter(s);
    }
    static void middleCharacter(String s){
        int len=s.length();
        char mid=s.charAt(len/2);

            System.out.println(mid);
    }
}
