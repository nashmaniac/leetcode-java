package medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode_440 {
    public void solve() {
        findKthNumber(13, 2);
    }


    class NumberComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.toString().compareTo(o2.toString());
        }
    }

    public int findKthNumber(int n, int k) {
        PriorityQueue<Integer> a = new PriorityQueue<>(new NumberComparator());
        for(int i=0;i<n;i++) {
            a.add(i+1);
        }
        int ao = -1;
        for(int i=0;i<k;i++) {
            ao = a.poll();
        }
        return ao;
    }

    public static void main(String[] args) {
        leetcode_440 t = new leetcode_440();
        t.solve();
    }
}
