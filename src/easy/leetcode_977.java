package easy;

import java.util.Arrays;

public class leetcode_977 {
    public void solve() {
    }

    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        leetcode_977 t = new leetcode_977();
        t.solve();
    }
}
