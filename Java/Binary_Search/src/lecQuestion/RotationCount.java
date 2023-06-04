package lecQuestion;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr={7,8,12,15,18,2,3,6,};
        int noOfrotation=findPivot(arr)+1;
        System.out.println(noOfrotation);

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
