package medium;

public class leetcode_351 {
    public void solve() {
    }


    boolean[] status = new boolean[9];
    public int calculatePatterns(int last, int length) {
        if(length == 0) {
            return 1;
        }
        int sum = 0;
        for(int i=0;i<9;i++) {
            if(isValid(last, length)) {
                status[i] = true;
                sum += calculatePatterns(i, length-1);
                status[i] = false;
            }
        }
        return sum;
    }

    public boolean isValid(int last, int index) {
        if(status[index]) {
            return false;
        }

        if(last == -1) {
            return true;
        }

        if((last+index)%2 == 1) {
            return true;
        }

        int mid = (last+index) / 2;

        if(mid == 4) {
            return status[mid];
        }


        if((index%3 != last%3) && (index/3 != last/3)) {
            return true;
        }

        return status[mid];

    }

    public int numberOfPatterns(int m, int n) {
        int sum = 0;
        for(int i=m;i<=n;i++) {
            sum += calculatePatterns(-1, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        leetcode_351 t = new leetcode_351();
        t.solve();
    }
}
