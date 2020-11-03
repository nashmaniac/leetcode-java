package leetcode.s1401_1500;

public class leetcode_1475 {

    public int[] finalPrices(int[] prices) {
        for (int i=0;i< prices.length-1;i++) {
            int min_index = -1;
            for(int j=i+1; j< prices.length;j++) {
                if(prices[j]<=prices[i]) {
                    min_index = j;
                    break;
                }
            }
            if (min_index > -1) {
                prices[i] -= prices[min_index];
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        leetcode_1475 t = new leetcode_1475();

        int[] m = t.finalPrices(new int[]{10,1,1,6});
        for(int b: m) {
            System.out.print(b+" ");
        }
    }
}
