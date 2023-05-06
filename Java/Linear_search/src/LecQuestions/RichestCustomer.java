package LecQuestions;

public class RichestCustomer {
    public static void main(String[] args) {
   int[][] arr={{1,2,3},{3,2,8}};


        System.out.println(money(arr));

    }
    static int money(int[][] arr){
        int ans=0;

        for (int i = 0; i < arr.length; i++) {
            int Sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                Sum=Sum+arr[i][j];
            }
            if(Sum>ans){
                ans=Sum;
            }
        }

        return ans;
    }

}
