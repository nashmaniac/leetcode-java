package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode_402 {
    public void solve() {
    }

    public String removeKdigits(String num, int k) {
        List<Integer> a = new ArrayList<>();
        for(char c: num.toCharArray()) {
            a.add(Integer.parseInt(String.valueOf(c)));
        }

        Collections.sort(a);
        StringBuilder s = new StringBuilder();
        for(int i=0;i<num.length()-k;i++) {
            s.append(a.get(i));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        leetcode_402 t = new leetcode_402();
        t.solve();
    }
}
