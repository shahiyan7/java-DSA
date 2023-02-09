package com.shahiyan;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

//        1.odd and Even Program

//        System.out.print("Enter the Number: ");
//        Scanner in= new Scanner(System.in);
//        int num= in.nextInt();
//        if(num%2==0){
//            System.out.println("Even Number");
//        }else {
//            System.out.println("" +
//                    "Odd Number ");
//        }


//        2.Taking String as an input

//        System.out.print("Enter your Name: ");
//        Scanner in=new Scanner(System.in);
//        String name=in.nextLine();
//        System.out.println("Welcome to java "+name);


//        3.Simple Intrest prblem
//        Scanner in=new Scanner(System.in);
//        System.out.print("Enter P: ");
//        int P=in.nextInt();
//        System.out.print("Enter R : ");
//        float R=in.nextFloat();
//        System.out.print("Enter T: ");
//        float T= in.nextFloat();
//        float SI=(P*R*T)/100;
//        System.out.println(SI);


//        4.Basic calculator program;
//        Scanner in= new Scanner(System.in);
//        int n1=in.nextInt();
//        int n2=in.nextInt();
//        char operator=in.next().charAt(0);
//        int sum=n1+n2;
//        int sub=n1-n2;
//        int multi=n1*n2;
//        int divide=n1/n2;
//        if(operator=='+'){
//            System.out.println("The sum of no is :"+sum);
//        }
//        if(operator=='-'){
//            System.out.println("The sub of no is :"+sub);
//        }
//        if(operator=='/'){
//            System.out.println("The division of no is :"+divide);
//        }
//        if(operator=='*'){
//            System.out.println("The multiplication of no is :"+multi);
//        }


//        5.Take 2 numbers as input and print the largest number.
//          Scanner in= new Scanner(System.in);
//        System.out.println("Enter the numbers");
//          int n1=in.nextInt();
//          int n2=in.nextInt();
//          if (n1==n2){
//              System.out.println("Both "+n1+" and "+n2+" are equal");
//          }
//          else if (n1>n2){
//              System.out.println(n1+" is the largest number");
//          }
//          else {
//              System.out.println(n2+" is the largest number");
//          }


//        6.Input currency in rupees and output in USD.
//        Scanner in=new Scanner(System.in);
//        System.out.print("Enter the value in RS:");
//        int money=in.nextInt();
//        float usd= (float) (money*0.012);
//        System.out.println("your money in $: " +usd);


//       7. To calculate Fibonacci Series up to n numbers.
//        Scanner in =new Scanner(System.in);
//        System.out.print("Enter the no of digit you want in your Fibonacci Series: ");
//        int n=in.nextInt();
//        int flag1=0;
//        int flag2=1;
//        int fibNo;
//        int count=0;
//        System.out.print(flag1+" ");
//        System.out.print(flag2+" ");
//        while(count<n-2){
//            fibNo=flag1+flag2;
//            flag1=flag2;
//            flag2=fibNo;
//            System.out.print(fibNo+" ");
//            count++;
//        }

//        8.To find out reverse of String .
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String word=in.nextLine();
        String reverseWord="";
        for(int i=word.length()-1;i>=0;i--){
           reverseWord+=word.charAt(i);
        }
        System.out.println("Reverse of your string is: "+reverseWord);



    }
}
