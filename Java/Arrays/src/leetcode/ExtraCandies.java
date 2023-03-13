package leetcode;

import java.util.Arrays;

public class ExtraCandies {
    public static void main(String[] args) {
        int[] candy={2,3,5,1,3};
        int extraCandy=3;
       boolean[] result=new boolean[candy.length];
        for(int i=0;i< candy.length;i++){
            candy[i]=candy[i]+extraCandy;
            int greatest=candy[i];
            for (int j = 0; j <candy.length ; j++) {
                if(candy[j]>greatest){
                  greatest=candy[j];
                }
                if(j==candy.length-1){
                    if(greatest==candy[i]){
                        result[i]=true;
                    }
                    else{
                        result[i]=false;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
