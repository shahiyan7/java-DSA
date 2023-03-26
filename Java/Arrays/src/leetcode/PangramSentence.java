package leetcode;

import java.util.ArrayList;
import java.util.Locale;

public class PangramSentence {
    public static void main(String[] args) {
        ArrayList<Character> alphabet= new ArrayList<Character>(26);
        String str="leetcode";
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.add(i);
        }
        System.out.println(alphabet);
        String check=str.toLowerCase();
        for (int i = 0; i <check.length() ; i++) {
            char remove=check.charAt(i);
            alphabet.remove(remove);
        }
        if(alphabet.isEmpty()){
            System.out.println("Pangram");
        }
        else {
            System.out.println("not pangrm");
        }
    }
}
