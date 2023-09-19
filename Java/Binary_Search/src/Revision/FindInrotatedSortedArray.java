package Revision;

public class FindInrotatedSortedArray {
    public static void main(String[] args) {
       int[] arr={7,8,9,10,11,12,13,14,15,1,2,3,4,5,6};
       int target=1;
       int pivot=findPivot(arr);
       int ans=-1;
       if(pivot==-1){
           ans=binarySearch(arr,target,0, arr.length-1);
       }
       else if(target==arr[pivot]){
           ans=pivot;

       }
       else if(target>=arr[0]){
           ans=binarySearch(arr,target,0,pivot-1);
       }
       else {
           ans=binarySearch(arr,target,pivot+1, arr.length-1);
       }
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr,int target ,int start, int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }



    public static int findPivot(int[] arr){
        int ans=-1;
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            else  if (mid>s&& arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else  if (arr[mid]<arr[s]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return -1;
    }
}
