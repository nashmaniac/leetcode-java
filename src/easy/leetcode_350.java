package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class leetcode_350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i: nums1) {
            h.put(i, h.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int j: nums2) {
            if(h.containsKey(j) && h.get(j) > 0) {
                a.add(j);
                h.put(j, h.get(j)-1);
            }
        }
        int[] ao = a.stream().mapToInt(i->i).toArray();
        return ao;
    }


    public void solve() {
    }

    public static void main(String[] args) {
        leetcode_350 t = new leetcode_350();
        t.solve();
    }
}
