package leetcode.s0401_500;

import java.util.Arrays;

public class leetcode_455 {

    public int findContentChildren(int[] g, int[] s) {
        int gIndex= 0;
        int sIndex = 0;
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (gIndex<g.length && sIndex < s.length) {
            if(g[gIndex]<=s[sIndex]) {
                count++;
                gIndex++;
                sIndex++;
            } else {
                sIndex++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_455 t = new leetcode_455();
    }
}
