package Easy;

public class countZeros {
    public static int countZeros(int n,int count){
        if(n%10==n){
            if(n!=0){
                return count;
            }
            else{
                return count+1;
            }

        }
        int rem =n%10;
        if(rem==0){
          return   countZeros(n/10,count+1);
        }
        else{
            return countZeros(n/10,count);
        }
    }

    public static void main(String[] args) {
        int ans =countZeros(00000,0);
        System.out.println(ans);
    }
}
