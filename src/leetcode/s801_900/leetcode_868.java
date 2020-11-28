package leetcode.s801_900;

public class leetcode_868 {

    public int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        int min = 0;
        int max = 0;
        int maxCount = 0;
        for(int i=0;i<bin.length();i++) {
            if(bin.charAt(i) == '1') {
                max = i;
                if(maxCount < max-min) {
                    maxCount = max-min;
                }
                min = max;
            }
        }
        return maxCount;
    }

    public void solve() {
        System.out.println(binaryGap(22));
    }

    public static void main(String[] args) {
        leetcode_868 t = new leetcode_868();
        t.solve();
    }
}
