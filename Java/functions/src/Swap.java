import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
//        int a=10,b=20;
//        swap(a,b);
//        System.out.println(a+"  "+b);
        Scanner in=new Scanner(System.in);
//        System.out.println("Enter your Name: ");
//         String name=in.next();
//         name= greet(name) ;
//         System.out.println(name);
        System.out.println("Enter the numbers: ");
         int a=in.nextInt();
         int b=in.nextInt();
        swap(a,b);
//        here its not changing value because its only change the value of copy of that refrence variable not the original one
        System.out.println(a);
        System.out.println(b);
    }
//  static   String greet(String name){
//        name="kaify";
//        return name;
//    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println(a+"  "+b);
    }
}
