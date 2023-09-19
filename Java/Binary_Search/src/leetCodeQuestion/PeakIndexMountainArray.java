package leetCodeQuestion;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,5,4,3,1 };
        System.out.println(peakIndex(arr));
    }
    public  static int peakIndex(int[] arr){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start +(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
}
