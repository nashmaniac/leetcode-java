package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class leetcode_1086 {
    public void solve() {

    }

    public int[][] highFive(int[][] items) {
        HashMap<Integer, Integer> studentMap = new HashMap<>();
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        ArrayList<PriorityQueue<Integer>> arr = new ArrayList<>();

        int count = 0;
        for(int i=0;i<items.length;i++) {
            int[] a = items[i];
            int countMap = studentMap.getOrDefault(a[0], -1);
            if(countMap == -1) {
                studentMap.put(a[0], count);
                indexMap.put(count, a[0]);
                count++;
            } else {
                PriorityQueue<Integer> q = arr.get(countMap);
                if(q == null) {
                    q = new PriorityQueue<Integer>((c, b) -> Integer.compare(b, c));
                }
                q.offer(a[1]);
            }
        }

        int[][] res = new int[arr.size()][];
        for(int i=0;i<arr.size();i++) {
            int sum = 0;
            for(int j=0;j<5;j++) {
                sum += arr.get(i).poll();
            }
            res[i] = new int[] {indexMap.get(i), sum/5};
        }

        Arrays.sort(res, (o1, o2) -> Integer.compare(o1[0], o2[0]));

        return res;
    }

    public static void main(String[] args) {
        leetcode_1086 t = new leetcode_1086();
        t.solve();
    }
}
