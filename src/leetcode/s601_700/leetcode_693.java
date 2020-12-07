package leetcode.s601_700;

public class leetcode_693 {

    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        char seen = s.charAt(0);
        for(int i=1;i<s.length();i++) {
            if(seen == s.charAt(i)) {
                return false;
            }
            seen = s.charAt(i);
        }
        return true;
    }

    public void solve() {
        hasAlternatingBits(5);
    }

    public static void main(String[] args) {
        leetcode_693 t = new leetcode_693();
        t.solve();
    }
}
