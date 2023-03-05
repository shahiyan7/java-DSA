package assignment.com;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String Word=in.next();
        int len=Word.length();
//        System.out.println(len);
        int noOFVowel=vowelCounter(Word);
        System.out.println("Total no vowels is: "+noOFVowel);
    }
    static int vowelCounter(String Word){
        int flag=0;
        int counter=0;
       for(int i=0;i<Word.length();i++){

           char charcheck=Word.charAt(i);
           if(charcheck=='a'||charcheck=='e'||charcheck=='i'||charcheck=='o'||charcheck=='u'||charcheck=='A'||charcheck=='E'||charcheck=='I'||charcheck=='O'||charcheck=='U'){
               counter++;
           }
       }
       return counter;
    }

}
