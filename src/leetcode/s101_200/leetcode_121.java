package leetcode.s101_200;

public class leetcode_121 {

    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++) {
            if(prices[i]<minPrice) {
                minPrice = prices[i];
            }
            if(prices[i]-minPrice>maxProfit) {
                maxProfit = prices[i]-minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        leetcode_121 t = new leetcode_121();
    }
}
