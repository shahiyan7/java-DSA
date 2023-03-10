package Problems.com;

public class MaximumValue {
    public static void main(String[] args) {
        int[] arr ={1,55,78,3,8};
       int maximum= Max(arr);
        System.out.println(maximum);
    }

    private static int Max(int[] arr) {
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
