package leetcode.s1601_1700;

public class leetcode_1688 {

    public int numberOfMatches(int n) {
        int count = 0;
        while (n>1) {
            if(n%2 == 0) {
                count+=n/2;
                n = n/2;
            } else {
                count += ((n-1)/2);
                n = ((n-1)/2 + 1);
            }
        }
        return count;
    }

    public void solve() {
        System.out.println(numberOfMatches(7));
    }

    public static void main(String[] args) {
        leetcode_1688 t = new leetcode_1688();
        t.solve();
    }
}
