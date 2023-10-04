package Easy;

public class reverse2 {

    public static int rev(int n){
        int arg=(int)(Math.log10(n))+1;
        return helper( n, arg);
    }
    public static int helper(int n,int arg){
        if(n%10==n){
            return n;
        }
        int rem =n%10;
        return (int) (rem*Math.pow(10,arg-1)+helper(n/10,arg-1));
    }

    public static void main(String[] args) {
        int ans =rev(97);
        System.out.println(ans );
    }
}
