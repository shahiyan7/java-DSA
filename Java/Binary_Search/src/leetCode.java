public class leetCode {
    public static void main(String[] args) {
       int ans = arrangeCoins(10);
        System.out.println(ans);
    }

    public static int arrangeCoins(int n) {
        int leftCoin=n;
        int completeRow=0;
        for(int i=1;i<=n;i++){
            if(leftCoin>=i){
                leftCoin=leftCoin-i;
                completeRow++;
            }
        }
        return completeRow;
    }
}
