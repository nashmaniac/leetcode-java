package easy;

import java.util.HashMap;

public class leetcode_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(h.containsKey(target-nums[i])) {
               return new int[] {h.get(target-nums[i]), i};
            } else {
                h.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }


    public void solve() {
    }

    public static void main(String[] args) {
        leetcode_1 t = new leetcode_1();
        t.solve();
    }
}
