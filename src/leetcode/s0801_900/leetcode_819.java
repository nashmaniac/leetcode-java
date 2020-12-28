package leetcode.s0801_900;

import java.util.HashSet;

public class leetcode_819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.replaceAll("[^a-zA-Z]", "").toLowerCase().split("\\s+");
        HashSet<String> hashSet = new HashSet<>();
        for(String w: banned) {
            hashSet.add(w);
        }

        return paragraph;

    }

    public void solve() {
        String s = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[] {"hit"};
        mostCommonWord(s, banned);
    }

    public static void main(String[] args) {
        leetcode_819 t = new leetcode_819();
        t.solve();
    }
}
