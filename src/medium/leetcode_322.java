package medium;

import java.util.Arrays;

public class leetcode_322 {
    public void solve() {
        coinChange(new int[]{1, 2, 5}, 11);
    }

    public int coinChange(int[] coins, int amount) {
        int[] a = new int[amount+1];


        for(int i=1;i<a.length;i++) {
            a[i] = amount+1;
        }
        a[0] = 0;
        for(int i=1;i<a.length;i++) {
            for(int j=0;j<coins.length;j++) {
                if(coins[j]<=i) {
                    a[i] = Math.min(a[i], 1+a[i-coins[j]]);
                }
            }
        }
        return a[amount];
    }

    public static void main(String[] args) {
        leetcode_322 t = new leetcode_322();
        t.solve();
    }
}
