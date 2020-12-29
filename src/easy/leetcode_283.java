package easy;

public class leetcode_283 {
    public void solve() {
    }

    public void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0) {
                nums[pos++] = nums[i];
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        leetcode_283 t = new leetcode_283();
        t.solve();
    }
}
