package leetcode;

//You are given an m x n integer grid accounts where accounts[i][j] is the amount
// of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

//  A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

public class MaximumWealth {
    public static void main(String[] args) {
     int[][] accounts={{1,2,3},{4,5,6}};
     int m= accounts.length;

        for (int i = 0; i < accounts.length; i++) {
            int wealth1=0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth1+=accounts[i][j];
            }
            System.out.println("Wealth of customer is "+ wealth1);

        }
    }
}
