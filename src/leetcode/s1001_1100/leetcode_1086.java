package leetcode.s1001_1100;

import java.util.*;

public class leetcode_1086 {

    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> maps = new HashMap<>();

        int K = 5;
        for(int i=0;i<items.length;i++) {
            int id = items[i][0];
            int score = items[i][1];
            PriorityQueue<Integer> pq;
            if(maps.containsKey(id)) {
                pq = maps.get(id);
            } else {
                pq = new PriorityQueue<>();
                maps.put(id, pq);
            }
            pq.add(score);
            if(pq.size() > K) {
                pq.poll();
            }
        }

        int[][]result = new int[maps.size()][2];
        int resultIdx = 0;
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : maps.entrySet()) {
            PriorityQueue<Integer> pq = entry.getValue();
            int scoreSum = 0;
            for (int score : pq) {
                scoreSum += score;
            }
            result[resultIdx][0] = entry.getKey();
            result[resultIdx][1] = scoreSum / K;
            ++resultIdx;
        }
        return result;

    }


    public void solve() {

        int[][] numbers = new int[][]{{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        highFive(numbers);

    }
    public static void main(String[] args) {
        leetcode_1086 t = new leetcode_1086();
        t.solve();
    }
}
