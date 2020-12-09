package leetcode.s0501_600;

import java.util.ArrayList;

public class leetcode_507 {

    public boolean checkPerfectNumber(int num) {
        ArrayList<Integer> m = new ArrayList<>();
        int count = 1;
        while (count <= num/2) {
            if(num%count == 0) {
                m.add(count);
            }
            count++;
        }
        int sum = 0;
        for(Integer i: m) {
            sum += i;
        }
        return num==sum;
    }

    public void solve() {
        checkPerfectNumber(28);
    }

    public static void main(String[] args) {
        leetcode_507 t = new leetcode_507();
        t.solve();
    }
}
