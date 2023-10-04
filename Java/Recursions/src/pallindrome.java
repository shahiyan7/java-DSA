public class pallindrome {
    public static boolean isPalindrome(int n){
        int revNumber=rev(n);
        if(revNumber==n){
            return true;
        }
        else {
            return false;
        }
    }
    public static int  rev(int n){
      int arg=(int)(Math.log10(n))  +1;
      return helper(n, arg);
    }
    public static int helper(int n,int arg){
        if(n%10==n){
            return n;
        }
        int rem =n%10;
        return (int) (rem*Math.pow(10,arg-1)+helper(n/10,arg-1));
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
    }
}
