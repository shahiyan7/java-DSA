import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=in.next();
       String message=greet(name);
        System.out.println(message);
    }
    static String greet(String name){
        String greeting="How are you "+name;
        return greeting;
    }
}
