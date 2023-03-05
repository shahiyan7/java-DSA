package assignment.com;

import java.util.Scanner;

public class PrimeInBet {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the starting number: ");
         int num1=in.nextInt();
        System.out.println("Enter the last number: ");
         int num2=in.nextInt();
        for (int i = num1; i <num2 ; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        else{
            return false;
        }
    }
}
