package leetcode.s1601_1700;

public class leetcode_1672 {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++) {
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++) {
                sum+=accounts[i][j];
            }
            if(sum>max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        leetcode_1672 t = new leetcode_1672();
    }
}
