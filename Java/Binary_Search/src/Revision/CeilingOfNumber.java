package Revision;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={1,3,6,9,10,12,15,18,20,21};
        System.out.println(CeilingOfNumber(arr,16));
        System.out.println(CeilingOfNumber(arr,14));
        System.out.println(CeilingOfNumber(arr,12));
        System.out.println(CeilingOfNumber(arr,5));




    }
    public  static int CeilingOfNumber(int[] arr,int target){
        int s=0;
        int e= arr.length-1;

        while (s<=e){
            int mid=s+(e-s)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            else if(target>arr[mid]){
                s=mid+1;

            }
            else{
                e=mid-1;
            }
        }
        return arr[s];
    }
}
