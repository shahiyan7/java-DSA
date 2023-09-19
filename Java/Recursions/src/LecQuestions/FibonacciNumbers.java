package LecQuestions;

public class FibonacciNumbers {
    public static void main(String[] args) {
       int ans= fibonacci(6);
        System.out.println(ans);
    }
    public static int fibonacci(int n){
        int ans;
        if(n<2){
            return n ;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }
}
