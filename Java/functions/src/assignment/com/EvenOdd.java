package assignment.com;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number: ");
        int num=in.nextInt();
        numCheck(num);


    }
    static void numCheck(int n){
        if(n%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
