package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class leetcode_56 {
    public void solve() {
    }


    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> a = new LinkedList<int[]>();

        for(int i=0;i<intervals.length;i++) {
            if(a.isEmpty()) {
                a.add(intervals[i]);
            }

            if(a.getLast()[1] < intervals[i][0]) {
                a.getLast()[1] = intervals[i][1];
            } else {
                a.add(intervals[i]);
            }
        }

        return a.toArray(new int[a.size()][]);

    }

    public static void main(String[] args) {
        leetcode_56 t = new leetcode_56();
        t.solve();
    }
}
