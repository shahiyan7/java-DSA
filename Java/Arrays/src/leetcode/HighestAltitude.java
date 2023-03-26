package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        ArrayList<Integer> altitude= new ArrayList<>();
        altitude.add(0);
        for (int i = 0; i < gain.length; i++) {
            int newElement=altitude.get(i)+gain[i];
            altitude.add(newElement);
        }
        System.out.println(altitude);
        int highest= Collections.max(altitude);
        System.out.println("Highest: "+highest);
    }
}
