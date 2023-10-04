package LecQuestions;

class Solution {
    public static boolean isPowerOfThree(int n) {
        int num =helper(n);
        if (num%3==0){
            return true;
        }
        return false;
    }
    public static int helper(int n){
        if(n/3 <= 2){
            return n;
        }
        return helper(n/3);
    }

    public static void main(String[] args) {
       boolean ans= isPowerOfThree(5
       );
        System.out.println(ans);
    }
}