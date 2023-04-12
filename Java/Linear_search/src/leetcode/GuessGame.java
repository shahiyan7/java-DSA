package leetcode;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Rule for the Game:");
        System.out.println("rule 1: -1: Your guess is higher than the number I picked ");
        System.out.println("rule 2:  1: Your guess is lower than the number I picked ");
        System.out.println("rule 3:  0: your guess is equal to the number I picked");
        System.out.println("Pick a nnumber: ");
        int num=in.nextInt();
        System.out.println("Guess the number: ");
        int guess=in.nextInt();
        int ans=guessNumber(num,guess);
        System.out.println(ans);
    }
    static int guessNumber(int num,int guess){
        if(guess==num){
            return 0;
        }
        if (guess>num) {
            return -1;

        }
        return 1;
    }
}
