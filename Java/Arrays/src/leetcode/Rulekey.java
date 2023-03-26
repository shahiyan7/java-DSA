package leetcode;

import java.util.Arrays;

public class Rulekey {
    public static void main(String[] args) {
        String[][] items={{"phone","blue","pixel"},{"computer","silver","lenevo"},{"phone","gold","iphone"}};
        String ruleKey="color";
        String ruleValue="phone";
        for (int i = 0; i < items.length; i++) {

            for (int j = 0; j <items[i].length ; j++) {
                if(ruleValue==items[i][j]){
                    int key =i;
                    System.out.println(Arrays.toString(items[i]));
                    break;
                }
            }
        }
    }
}
