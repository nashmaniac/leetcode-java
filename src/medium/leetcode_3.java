package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class leetcode_3 {
    public void solve() {

        lengthOfLongestSubstring("abccdab");
    }

    public int lengthOfLongestSubstringSlidingWindow(String s) {
        int n = s.length();
        int i = 0, j=n-1, ans = 0;


        HashSet<Character> h = new HashSet<>();
        while (i<n && j<n) {
            char c = s.charAt(j);
            if(!h.contains(c)) {
                h.add(c);
                ans = Math.max(ans, j-i+1);
                j++;
            } else {
                h.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }

    public int lengthOfLongestSubstringSlidingWindowOptimized(String s) {
        int n = s.length();
        int i = 0, ans = 0;

        HashMap<Character, Integer> h = new HashMap<>();
        for(int j=0;j<n;j++) {
            if(h.containsKey(s.charAt(j))) {
                i = Math.max(i, h.get(s.charAt(j)));
            }
            ans = Math.max(ans, j-i+1);
            h.put(s.charAt(j), j+1);
        }
        return ans;
    }

    public int lengthOfLongestSubstring(String s) {
        return lengthOfLongestSubstringSlidingWindow(s);
    }

    public static void main(String[] args) {
        leetcode_3 t = new leetcode_3();
        t.solve();
    }
}
