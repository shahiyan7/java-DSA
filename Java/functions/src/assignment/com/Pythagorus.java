package assignment.com;

import java.util.Scanner;

public class Pythagorus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the three num: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();
        System.out.println(isPythagorus(num1,num2,num3));
    }
    static boolean isPythagorus(int n1,int n2, int n3){
        if (n3*n3==(n1*n1)+(n2*n2)){
            return  true;
        }
        else{
            return false;
        }
    }
}
