package leetCodeQuestion;

public class FIndSquareRoot {
    public static void main(String[] args) {
        System.out.println(findSquareRoot(37));

    }
    public static int findSquareRoot(int n){
        int ans=1;
        for (int i = 1; i <=n/2 ; i++) {
            if(i*i<=n){
                ans=i;
            }
            else{
                ans=i-1;
                return ans;
            }
        }
        return ans;
    }

}
