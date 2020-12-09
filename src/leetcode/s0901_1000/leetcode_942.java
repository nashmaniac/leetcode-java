package leetcode.s0901_1000;

public class leetcode_942 {
    public int[] diStringMatch(String S) {
        int lowest = 0;
        int highest = S.length();
        int[] a = new int[highest+1];

        for(int i=0;i<S.length();i++) {
            if(S.charAt(i) == 'D') {
                a[i] = highest--;
            } else {
                a[i] = lowest++;
            }
        }
        a[a.length-1] = lowest;
        return a;
    }

    public void solve() {
        diStringMatch("IDID");
    }

    public static void main(String[] args) {
        leetcode_942 t = new leetcode_942();
        t.solve();
    }
}
