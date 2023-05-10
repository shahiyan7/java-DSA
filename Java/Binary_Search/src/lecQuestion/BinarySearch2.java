package lecQuestion;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr={90,87,71,65,43,32,25,21,17,12,3,1};
        int target =17;
        int ans= binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(target==arr[mid]){
                return  mid;
            } else if (target>arr[mid]) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return -1;
    }
}
