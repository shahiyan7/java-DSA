package assignment.com;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=in.nextInt();
        primeNo(num);

    }
    static void primeNo(int n){
      int flag=0;
      int i=1;
      while(i<n) {
         if (n%i==0){
             flag++;
         }
         i++;
      }
        if(flag>2){
            System.out.println("Not the prime number");
        }
        else{
            System.out.println("Prime number ");
        }
    }
}
