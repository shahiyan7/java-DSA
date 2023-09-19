package leetCodeQuestion;

public class InsertPosition {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target =4;
      int ans= IndexPosition(arr,target);
        System.out.println(ans);

    }

    public  static int IndexPosition(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int m=(s+e)/2;
            if(arr[m]==target){
                return m;
            }
            else if(arr[m]>target){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return s;
    }
}
