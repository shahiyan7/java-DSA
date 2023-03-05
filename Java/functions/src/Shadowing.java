public class Shadowing {
  static int x=70;
    public static void main(String[] args) {
        System.out.println(x);
        int x=50;
        System.out.println(x);
        test();
    }
    static void test(){
        System.out.println(x);
    }
}
