package leetcode.s001_100;

public class leetcode_7 {

    public int reverse(int x) {
        int rev = 0;
        while (x!=0) {
            int temp = x%10;
            if(rev > Integer.MAX_VALUE/10 || (rev<Integer.MAX_VALUE/10 && temp > 7)) {
                return 0;
            }
            if(rev < Integer.MIN_VALUE/10 || (rev>Integer.MIN_VALUE/10 && temp < 8)) {
                return 0;
            }
            rev = rev * 10 + temp;
            x = x / 10;

        }
        return x;
    }

    public void solve() {
        System.out.println(reverse(-123));
    }

    public static void main(String[] args) {
        leetcode_7 t = new leetcode_7();
        t.solve();
    }
}
