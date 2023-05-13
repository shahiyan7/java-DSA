package leetCodeQuestion;

public class CeilingOfLetter {
    public static void main(String[] args) {
        Character[] arr={'c','f','j'};
       char target='a';
       char ans=smallestLetter(arr,target);
        System.out.println(ans);
    }

   static char smallestLetter(Character[] arr, char target) {
        if(target>=arr[arr.length-1]){
            return arr[0];
        }
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return arr[start];
   }
}
