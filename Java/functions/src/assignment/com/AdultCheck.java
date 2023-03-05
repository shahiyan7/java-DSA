package assignment.com;

import java.util.Scanner;

public class AdultCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age =in.nextInt();
        adultCheck(age);

    }
    static void adultCheck(int age ){
        if (age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("NOT eligible to vote");
        }
    }
}
