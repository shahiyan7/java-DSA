package LecQuestions;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] numbers={1,25,34,43,88,79,80,56};
        System.out.println("Enter the target: ");
        int target=in.nextInt();
        System.out.println("Rule: the range must be between "+0+"-"+(numbers.length-1)+": ");
        System.out.print("Enter the starting range: ");
        int l=in.nextInt();
        System.out.print("Enter the end range: ");
        int r= in.nextInt();
        int ans =linearSearch(numbers,target,l,r);
        System.out.println(ans);

    }
    static int linearSearch(int[] arr,int target,int l,int r ){
        if(arr.length==0){
            return -1;
        }
        for (int i = l; i < r; i++) {
            if(target==arr[i]){
                return i;
            }
        }
        return  -1;
    }
}
