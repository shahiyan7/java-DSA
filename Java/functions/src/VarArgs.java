import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      fun(10,10,11,12,13,14,15,16,17);
     test(10,"kaify","shahiyan","noman","faizan");
    }
    static void fun(int a,int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void test(int x, String ...y){
        System.out.println(x);
        System.out.println(Arrays.toString(y));
    }
}
