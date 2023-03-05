package assignment.com;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=in.nextInt();
        String reverse=Palindrome(num);
        String numString=String.valueOf(num);
        System.out.println(reverse);
        if(num==Integer.parseInt(reverse)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

    }
    static String Palindrome(int n){
        String revNum="";
     while (n!=0){
         int lastDigit=n%10;
         n=n/10;
         revNum=revNum+lastDigit;
     }
     return revNum;
    }
}
