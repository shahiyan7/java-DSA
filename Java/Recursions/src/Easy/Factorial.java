package Easy;

public class Factorial {
    public static void main(String[] args) {
        int ans=factorial(4);
        System.out.println(ans);
    }
    public static int factorial(int n){
        int ans;
         if (n==0){
            return 1;
        }

        ans= n*factorial(n-1);
         return ans;
    }
}
