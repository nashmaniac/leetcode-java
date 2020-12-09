package leetcode.s0201_300;

public class leetcode_268 {

    public int missingNumber(int[] nums) {
        int sum = (nums.length)*(nums.length+ 1);
        sum = sum/2;
        for(int i=0;i<nums.length;i++) {
            sum-=nums[i];
        }
        return sum;
    }

    public void solve() {
        missingNumber(new int[]{3, 0, 1});
    }

    public static void main(String[] args) {
        leetcode_268 t = new leetcode_268();
        t.solve();
    }
}
