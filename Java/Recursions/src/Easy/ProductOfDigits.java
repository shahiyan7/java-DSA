package Easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        int ans =ProductOfDigits(1342);
        System.out.println(ans);
    }
    public static int ProductOfDigits(int n ){
        if (n%10==n){
            return n;
        }
        return (n%10) * ProductOfDigits(n/10);
    }
}
