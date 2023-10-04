package arrays;

public class CheckSorted {

    public static boolean isSorted(int[] arr,int index){
        if(index== arr.length-1){
            return true;
        }
         return (arr[index]<=arr[index+1] && isSorted(arr,index+1) );
    }

    public static void main(String[] args) {
        int[] arr={0};
        boolean ans =isSorted(arr,0);
        System.out.println(ans);
    }
}
