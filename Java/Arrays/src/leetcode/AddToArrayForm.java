package leetcode;

import java.util.ArrayList;

public class AddToArrayForm {
    public static void main(String[] args) {
     int[] num ={1,2,0,0};
     int k=34;
     ArrayList<Integer> ans= addToArrayForm(num,k);
        System.out.println(ans);
    }

    public static ArrayList<Integer> addToArrayForm(int[] num, int k){
        ArrayList<Integer> myAnswer=new ArrayList<>();
        String stringnumber="";
        for (int i = 0; i < num.length ; i++) {
            stringnumber=stringnumber+Integer.toString(num[i]);
        }
        int finalnum=Integer.parseInt(stringnumber)+k;
         while (finalnum>0){
             int digit=finalnum%10;
             myAnswer.add(0,digit);
             finalnum=finalnum/10;
         }
        return myAnswer;
    }


}
