package medium;

import java.util.*;

public class leetcode_347 {
    public void solve() {

//        int[] a = topKFrequent(new int[]{1,1,1,2,2,3}, 1);
        int[] a = topKFrequent(new int[]{-1, -1}, 1);
        for(int i: a) {
            System.out.println(i);
        }
    }

    class QueueComparator implements Comparator<Integer> {
        HashMap<Integer, Integer> h;
        QueueComparator(HashMap<Integer, Integer> a) {
            h = a;
        }


        @Override
        public int compare(Integer o1, Integer o2) {
            return h.get(o1).compareTo(h.get(o2));
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i: nums) {
            h.put(i, h.getOrDefault(i, 0)+1);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>(new QueueComparator(h));
        for(Map.Entry<Integer, Integer> a: h.entrySet()) {
            q.add(a.getKey());
            if(q.size() > k) {
                q.poll();
            }
        }

        int[] a = new int[k];
        for(int i=0;i<a.length;i++) {
            a[i] = q.poll();
        }
        return a;
    }

    public static void main(String[] args) {
        leetcode_347 t = new leetcode_347();
        t.solve();
    }
}
