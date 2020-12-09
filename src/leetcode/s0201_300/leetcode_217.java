package leetcode.s0201_300;

import java.util.HashSet;

public class leetcode_217 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if(h.contains(nums[i])) {
                return true;
            } else {
                h.add(nums[i]);
            }
        }
        return false;
    }

    public void solve() {
        containsDuplicate(new int[]{1, 2, 3, 1});
    }

    public static void main(String[] args) {
        leetcode_217 t = new leetcode_217();
        t.solve();
    }
}
