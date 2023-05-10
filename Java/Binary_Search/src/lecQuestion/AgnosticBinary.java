package lecQuestion;

public class AgnosticBinary {
    public static void main(String[] args) {
        int[] arr={90,87,71,65,43,32,25,21,17,12,3,1};
        int target =17;
        int[] arr2={12,23,34,56,78};
        int target2=56;
        int ans=AgnosticbinarySearch(arr,target);
        int ans2=AgnosticbinarySearch(arr2,target2);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans2);
    }
    static  int AgnosticbinarySearch(int[] arr, int target){

        int start=0;
        int end= arr.length-1;
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
