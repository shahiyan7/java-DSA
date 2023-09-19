package LeetcodeQuestions;

public class PowOFX {
    public static void main(String[] args) {
       double ans= myPow(2,-2);
        System.out.println(ans );
    }
    public static double myPow(int x, int n){
        if(n==0){
            return 1;
        }
        if(n>0){
            return myPow(x,n-1)*x;
        }
        else{
            return 1/myPow(x,-(n-1))*x;
        }

    }
}
