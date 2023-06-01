package lecQuestion;

public class RBS {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int ans=search(arr,0);
        System.out.println(ans);

    }
    static int search(int[] arr,int target){
        int start=0;
        int pivot=findPivot(arr);
        if(pivot==-1){
//            normal binary search because array is not rotated
          return   binarySearch(arr,target,0, arr.length-1);
        }
//        if you gat the pivot
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[start]){
            return binarySearch(arr,target,0,pivot-1);
        }
            return binarySearch(arr,target,pivot+1, arr.length-1);


    }

    static int binarySearch(int[] arr, int target,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return  mid;
            } else if (target>arr[mid]) {

                start=mid+1;
            }
            else {
               end=mid-1;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
