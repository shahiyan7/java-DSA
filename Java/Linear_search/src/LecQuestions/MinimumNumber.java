package LecQuestions;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] number={18,12,-7,3,14,28};
        System.out.println(min(number));
    }
    static int min(int[] arr){
        int minimum=arr[0];
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]<minimum) {
               minimum=arr[i];
           }
        }
        return minimum;
    }
}
