package LecQuestions;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,8,9,12,15,17,19,20,25,27};
        int target=27;
      int ans =  BinarySearch(arr,target,0, arr.length-1);

        System.out.println(ans);
    }
    public static int BinarySearch(int[] arr,int target,int s,int e){
        while (s<=e){
            int mid=s+(e-s)/2;
            if (target == arr[mid]){
                return mid;
            } else if (target<arr[mid]) {
                return   BinarySearch(arr,target,s,mid-1);
            }
            else{
                return   BinarySearch(arr,target,mid+1,e);
            }
        }

     return -1;
    }
}
