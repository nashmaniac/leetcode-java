package leetcode.s1001_1100;

import java.util.Arrays;

public class leetcode_1051 {

    public int heightChecker(int[] heights) {
        int count = 0;
        int[] a = new int[heights.length];
        for(int i=0;i<a.length;i++) {
            a[i] = heights[i];
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++) {
            if(a[i]!=heights[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_1051 t = new leetcode_1051();
    }
}
