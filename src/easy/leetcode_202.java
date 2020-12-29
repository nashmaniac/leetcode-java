package easy;

public class leetcode_202 {
    public void solve() {
    }

    public int getNext(int n) {
        int rev = 0;
        while (n>0) {
            int temp = n %10;
            rev = rev + (temp*temp);
            n = n/ 10;
        }
        return rev;
    }

    public boolean isHappy(int n) {
        int fastRunner = getNext(n);
        int slowRunner = n;

        while (fastRunner != 1 && slowRunner != fastRunner) {
            fastRunner = getNext(getNext(fastRunner));
            slowRunner = getNext(slowRunner);
        }
        return fastRunner == 1;
    }


    public static void main(String[] args) {
        leetcode_202 t = new leetcode_202();
        t.solve();
    }
}
