package lecQuestions;

import java.util.Scanner;

public class PrintNnumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number till you want to print: ");
        int n=in.nextInt();
        print(1,n);
        print2(n,1);
    }
    static void print(int i, int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        i++;
        print(i,n);
    }

    static void print2(int n, int i){
        if (n<i){
            return;
        }
        System.out.println(n);
        n--;
        print2(n,i);
    }
}
