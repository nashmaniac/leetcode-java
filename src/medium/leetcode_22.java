package medium;

import java.util.ArrayList;
import java.util.List;

public class leetcode_22 {
    public void solve() {
        for(String s: generateParenthesis(3)) {
            System.out.println(s);
        }
    }

    public List<String> helper(List<String> res, String a,  int open, int closed, int n) {
        if(a.length() == n*2) {
            res.add(a);
            return res;
        }
        if(open<n) {
            helper(res, a+"(", open+1, closed, n);
        }
        if(closed<open) {
            helper(res, a+")", open, closed+1, n);
        }
        return res;
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        return helper(res, "", 0, 0, n);
    }

    public static void main(String[] args) {
        leetcode_22 t = new leetcode_22();
        t.solve();
    }
}
