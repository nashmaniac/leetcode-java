package leetcode.s0101_200;

public class leetcode_122 {


    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++) {
            if(prices[i]>minPrice) {
                profit += (prices[i]-minPrice);
                minPrice = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        leetcode_122 t = new leetcode_122();
    }
}
