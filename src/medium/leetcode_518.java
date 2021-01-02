package medium;

public class leetcode_518 {
    public void solve() {
    }

    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++) {
            for(int j=0;j<amount+1;j++) {
                if(j == 0){
                    dp[i][j] = 0;
                }
                if(i == 0) {
                    dp[i][j] = j%coins[i] == 0 ? 1: 0;
                } else{
                    dp[i][j] = dp[i-1][j];
                    if(j>=coins[i]) {
                        dp[i][j] += dp[i][j-coins[i]];
                    }
                }

            }
        }
        return dp[coins.length-1][amount];
    }



    public static void main(String[] args) {
        leetcode_518 t = new leetcode_518();
        t.solve();
    }
}
