package Easy;

public class SumOfDigits {
    public static void main(String[] args) {
       int ans =sumOfDigits(5976);
        System.out.println(ans);
    }
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }
}
