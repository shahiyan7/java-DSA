import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int[] arr={1,22,34,56,76,43,90,39,78} ;
        System.out.println("Enter the target: ");
       int target=in.nextInt();
       int ans=linerSearch(arr,target);
        System.out.println(ans);
    }
    static int linerSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if(target==element){
                return i;
            }
        }
        return -1;
    }
}