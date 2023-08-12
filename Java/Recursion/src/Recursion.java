public class Recursion {
    public static void main(String[] args) {
      count();
    }
    static int n=0;
    static  void count(){
        if(n==3){
            return;
        }
        System.out.println(n);
        n++;
        count();
    }
}
