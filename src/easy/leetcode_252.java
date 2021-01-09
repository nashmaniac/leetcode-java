package easy;

import java.util.Arrays;
import java.util.LinkedList;

public class leetcode_252 {
    public void solve() {
    }

    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> a = new LinkedList<>();

        for(int i=0;i<intervals.length;i++) {
            if(a.isEmpty()) {
                a.add(intervals[i]);
            }

            if(a.getLast()[1] > intervals[i][0]) {
                return false;
            } else {
                a.add(intervals[i]);
            }
        }
        return true;
    }


    public static void main(String[] args) {
        leetcode_252 t = new leetcode_252();
        t.solve();
    }
}
