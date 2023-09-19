package Revision;

public class ElementPositionInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8,10,11,12,15,23,30};
        int target =7;
          int s=0;
          int e=1;
          int ans=-1;
          int newStart;
          while (target>arr[e]){
              int temp=e+1;
              e=e+(e-s+1)*2;
              s=temp;
              }

        System.out.println(binarySearch(arr,s,e,target));


    }
   public static int binarySearch(int[] arr, int start ,int end ,int target) {
       while ((start <= end)) {
//                   int  m=s+e/2; not written in this beacuse may in large value case it may exceed the int range
           int m = start + (end - start) / 2;

           if (target == arr[m]) {
               return m;
           } else if (target > arr[m]) {
               start = m + 1;
           } else {
               end = m - 1;
           }

       }
       return -1;
   }

}
