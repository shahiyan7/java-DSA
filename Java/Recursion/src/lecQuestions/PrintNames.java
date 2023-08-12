package lecQuestions;

import java.util.Scanner;

public class PrintNames {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of times you want to print the name: ");
        int n=in.nextInt();
        System.out.print("Enter the name you want to print: ");
        String name=in.next();
        print(1,n,name);
    }
    static void print(int i, int n,String name){
        if(i>n){
            return;
        }
        System.out.println(name);
        i++;
        print(i,n,name);
    }
}
