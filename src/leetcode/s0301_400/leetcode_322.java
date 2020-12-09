package leetcode.s0301_400;

import java.util.Arrays;

public class leetcode_322 {

    public int coinChange(int[] coins, int amount) {
        int[] countArray = new int[amount+1];

        Arrays.fill(countArray, amount+1);
        countArray[0] = 0;
        for(int i=1;i<amount+1;i++) {
//            int minimumValue = Integer.MAX_VALUE;
            for(int j=0;j<coins.length;j++) {
                if (coins[j]<=i) {
                    countArray[i] = Math.min(
                            countArray[i], 1+countArray[i-coins[j]]
                    );
                }
            }
        }
        return countArray[amount] > amount? -1: countArray[amount];
    }
    public static void main(String[] args) {
        leetcode_322 t = new leetcode_322();
        int[] coins = new int[] {2};
        int amount = 3;
        System.out.println(t.coinChange(coins, amount));
    }
}
