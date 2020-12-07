package leetcode.s1401_1500;

import java.util.ArrayList;

public class leetcode_1492 {

    public int kthFactor(int n, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int count = 1;

        a.add(count);
        if(count!=n/count && a.indexOf(n/count) == -1) {
            b.add(0, n/count);
        }

        count++;

        while (count<n/2) {
            if(n%count == 0) {
                if(b.indexOf(count) == -1) {
                    a.add(count);
                }
                if(count!=n/count && a.indexOf(n/count) == -1) {
                    b.add(0, n/count);
                }
            }
            count++;
        }

        a.addAll(b);
        if(k>a.size()) {
            return -1;
        }
        return a.get(k-1);
    }

    public void solve() {
//        kthFactor(16, 6);
        kthFactor(69, 5);
    }

    public static void main(String[] args) {
        leetcode_1492 t = new leetcode_1492();
        t.solve();
    }
}
