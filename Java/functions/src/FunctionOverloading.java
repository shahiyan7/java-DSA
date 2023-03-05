import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        System.out.println(sum(10,11,12));
        System.out.println(sum(10,11));
        fun(10,11,12,45,46);
        fun("10","14","34","45");
        fun("hii","hello","how","what");
    }
//    Funtion overloading is like a you can make a FUNCTION WITH SAME name but
//    it must have different type of arguments or different no of arguments
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
