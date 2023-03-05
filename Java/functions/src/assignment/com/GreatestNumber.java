package assignment.com;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1=in.nextInt();
        System.out.print("Enter the num2: ");
        int num2=in.nextInt();
        System.out.print("Enter the num3: ");
        int num3=in.nextInt();
      int maximum=  Max(num1,num2,num3);
      int minimum=Min(num1,num2,num3);
        System.out.println("The maximum number is: "+maximum);
        System.out.println("The minimum is: " + minimum);
    }
    static int Max(int n1,int n2,int n3){
        int max=n1;
        if(n2>max){
            max=n2;
        }
        if(n3>max){
            max=n3;
        }
        return max;
    }
    static int Min(int n1,int n2,int n3){
        int min=n1;
        if(n2<min){
            min=n2;
        }
        if(n3<min){
            min=n3;
        }
        return min;
    }
}
