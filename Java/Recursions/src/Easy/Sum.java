package Easy;

public class Sum {
    public static void main(String[] args) {
        int ans =sum(5);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n<=1){
            return n;
        }
        return n+sum(n-1);
    }
}
