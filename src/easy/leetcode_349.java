package easy;

import java.util.ArrayList;
import java.util.HashSet;

public class leetcode_349 {
    public void solve() {
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        for(int i: nums1) {
            h.add(i);
        }
        ArrayList<Integer> a = new ArrayList<>();
        for(int j: nums2) {
            if(h.contains(j) && !a.contains(j)) {
                a.add(j);
            }
        }
        int[] array = a.stream().mapToInt(i->i).toArray();
        return array;
    }

    public static void main(String[] args) {
        leetcode_349 t = new leetcode_349();
        t.solve();
    }
}
