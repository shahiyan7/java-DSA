package LecQuestions;

public class EvenNumberofDigits {
    public static void main(String[] args) {
//        method-1
        int[] nums = {1, 55, 23, 9, 345, 66};
        int ans = EvenDigits(nums);
        System.out.println(ans);

//        method-2 for finding even number of digits
        int[] num2 = {12, 234, 6754, 1, 289};
        int ans2 = EvenDigits(num2);
        System.out.println(ans2);
    }

    static int EvenDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String num = String.valueOf(arr[i]);
            if (num.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int EvenDigit2(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }
}
