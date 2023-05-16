package leetCodeQuestion;

public class FindINMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(search(arr,target));

    }
    public  static int search(int[] arr,int target){
        int peak=peakIndex(arr);
        int firstTry = OrderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
       return OrderAgnosticBS(arr,target,peak,arr.length-1);
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

    static  int OrderAgnosticBS(int[] arr, int target,int start,int end){


        boolean isAsc=arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return  mid;
            }
            if(isAsc){
                if (target>arr[mid]) {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
            else {
                if (target>arr[mid]) {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }

        }
        return -1;
    }

}
