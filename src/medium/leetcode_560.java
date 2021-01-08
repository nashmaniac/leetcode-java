package medium;

import java.util.HashMap;

public class leetcode_560 {
    public void solve() {
    }


    public int subarraySum(int[] nums, int k) {
        int count = 0, currSum = 0;
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            currSum += nums[i];

            if(currSum == k) {
                count++;
            }

            count += h.getOrDefault(currSum-k, 0);
            h.put(currSum, h.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_560 t = new leetcode_560();
        t.solve();
    }
}
