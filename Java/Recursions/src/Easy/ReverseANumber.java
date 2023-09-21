package Easy;

public class ReverseANumber {
    public static void main(String[] args) {
        int ans =ReverseANumber(1234);
        System.out.println(ans);
    }
    public static int  ReverseANumber(int n){
        String reverseNum="";
        if(n%10==n){
            return n;
        }
        reverseNum=String.valueOf(n%10)+ReverseANumber(n/10);
        return Integer.parseInt(reverseNum);
    }
}
