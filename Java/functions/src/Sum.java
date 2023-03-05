import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//         sum();
//         int ans =sum2();
//        System.out.println(ans);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1=in.nextInt();
        System.out.println("Enter the num2: ");
        int num2=in.nextInt();
        int newSum=sum3(num1,num2);
        System.out.println(newSum);
    }
    static  int sum3(int num1,int num2){
        int sum= num1+num2;
        return sum;
    }
    static int sum2(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the num 1: ");
        int num1=in.nextInt();
        System.out.println("Enter the num 2: ");
        int num2=in.nextInt();
        int sum =num1+num2;
        return sum;
    }
   static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the num 1: ");
        int num1=in.nextInt();
        System.out.println("Enter the num 2: ");
        int num2=in.nextInt();
        int sum =num1+num2;
        System.out.println("The sum is "+sum);
    }
}
