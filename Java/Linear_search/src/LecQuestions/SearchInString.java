package LecQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     String name="Shahiyan";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.print("Enter the charater: ");
     char target=in.next().charAt(0);
        System.out.println(search2(name,target));
    }

    static boolean search2(String word,char target){

        if(word.length()==0){
            return false;
        }
        for (char ch:word.toCharArray()) {
            if (ch==target) {

                return true;
            }
        }
        return false;
    }

    static boolean search(String word,char target){

        if(word.length()==0){
            return false;
        }
        for (int i = 0; i < word.length(); i++) {
            if (target == word.charAt(i)) {

                return true;
            }
        }
        return false;
    }
}
