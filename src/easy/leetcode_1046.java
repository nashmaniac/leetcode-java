package easy;

import java.util.PriorityQueue;

public class leetcode_1046 {
    public void solve() {

        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

    public int lastStoneWeight(int[] stones) {
        if(stones.length == 0) {
            return 0;
        }
        if(stones.length == 1) {
            return stones[0];
        }
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for(int i: stones) {
            q.offer(i);
        }

        while (q.size()>1) {
            int x = q.poll();
            int y = q.poll();
            if(x != y) {
                q.offer(Math.abs(x-y));
            }
        }
        if(q.isEmpty()) {
            return 0;
        } else {
            return q.poll();
        }
    }

    public static void main(String[] args) {
        leetcode_1046 t = new leetcode_1046();
        t.solve();
    }
}
