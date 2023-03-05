import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the name of fruit: ");
        Scanner in= new Scanner(System.in);
        String fruit=in.nextLine();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Orange" -> System.out.println("Rich in vitamin c");
            case "Apple" -> System.out.println("A sweet Fruit");
            case "Grapes" -> System.out.println("A small tasty fruit");
            default -> System.out.println("invalid Input");
        }
    }
}