package easy;

public class leetcode_121 {

    public int maxProfit(int[] prices) {
        int cost = 0;
        if(prices.length == 0) {
            return 0;
        }
        int minimum = prices[0];
        for (int i=1;i<prices.length;i++) {
            if(prices[i]<minimum) {
                minimum = prices[i];
            }
            if(prices[i]-minimum > cost) {
                cost = prices[i]-minimum;
            }
        }
        return cost;

    }


    public void solve() {
    }

    public static void main(String[] args) {
        leetcode_121 t = new leetcode_121();
        t.solve();
    }
}
