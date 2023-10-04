package Easy;

public class ReverseANumber {
    public static void main(String[] args) {
        int ans =ReverseANumber(1234);
        System.out.println(ans);
        rev1(564);
        System.out.println(sum);
    }
    public static int  ReverseANumber(int n){
        String reverseNum="";
        if(n%10==n){
            return n;
        }
        reverseNum=String.valueOf(n%10)+ReverseANumber(n/10);
        return Integer.parseInt(reverseNum);
    }
    static int sum=0;
    public static void rev1(int n){
        if(n==0){
            return ;
        }
        int rem =n%10;
        sum=(sum*10)+rem;
        rev1(n/10);
    }
}
