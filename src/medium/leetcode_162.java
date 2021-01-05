package medium;

public class leetcode_162 {
    public void solve() {
    }

    public int findPeakElement(int[] nums) {
        if(nums.length == 1) {
            return 0;
        }
        int index = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] > nums[i-1]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        leetcode_162 t = new leetcode_162();
        t.solve();
    }
}
