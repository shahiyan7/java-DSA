package leetCodeQuestion;

public class CeilingProblem {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=6;
        int ans=ceilingNumber(arr,target);
        System.out.println(ans);
    }
    static  int ceilingNumber(int[] arr,int target){
        int start=0;
        int ans=1000;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                ans=arr[mid];
                return ans;
            }
             else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                if(arr[mid]<ans){
                    ans=arr[mid];
                }
                end=mid-1;
            }
        }
        return ans;
    }
}
