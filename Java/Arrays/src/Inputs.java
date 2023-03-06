import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=in.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));


//        System.out.println("Do you want to print the Elements of array Again: Y/N");
//        char answer=in.next().charAt(0);
//
//        if(answer=='y'||answer=='Y'){
//            for (int i = 0; i < arr.length ; i++) {
//                System.out.print(arr[i]+" ");
//            }
//        } else if (answer=='n'||answer=='N') {
//            System.out.println("Thanks");
//        }
//        else {
//            System.out.println("Invalid Input");
//        }

    }
    static void stringArray(){
        Scanner in=new Scanner(System.in);
        String[] arr=new String[5];
        for (int i = 0; i < arr.length; i++) {
            String name=in.next();
        }

    }
}
