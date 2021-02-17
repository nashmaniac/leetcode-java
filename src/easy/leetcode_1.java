package easy;

import java.util.HashMap;

public class leetcode_1 {
    public void solve() {
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> a = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int temp = target-nums[i];

            if(a.containsKey(temp)) {
                return new int[]{a.get(temp), i};
            } else {
                a.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        leetcode_1 t = new leetcode_1();
        t.solve();
    }
}
