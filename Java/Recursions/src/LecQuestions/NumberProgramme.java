package LecQuestions;

public class NumberProgramme {
    public static void main(String[] args) {
        print1(1);
    }
    public static void print1(int n){
        System.out.println(n);
        print2(2);
        System.out.println("function 1 completed");
    }
    public static void print2(int n){
        System.out.println(n);
        print3(3);
        System.out.println("function 2 completed");
    }
    public static void print3(int n){
        System.out.println(n);
        print4(4);
        System.out.println("function 3 completed");
    }
    public static void print4(int n){
        System.out.println(n);
        System.out.println("function 4 completed");
    }
}
