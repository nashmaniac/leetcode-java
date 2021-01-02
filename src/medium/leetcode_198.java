package medium;

public class leetcode_198 {
    public void solve() {
    }

    public int rob(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] a = new int[nums.length];
        a[0] = nums[0];
        a[1] = Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++) {
            a[i] = Math.max(a[i-2]+nums[i], a[i-1]);
        }
        return a[a.length-1];
    }

    public static void main(String[] args) {
        leetcode_198 t = new leetcode_198();
        t.solve();
    }
}
