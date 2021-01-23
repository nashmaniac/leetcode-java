package easy;

public class leetcode_674 {
    public void solve() {
    }


    public int findLengthOfLCIS(int[] nums) {
        int count = 0, anchor = 0;

        for(int i=0;i<nums.length;i++) {
            if(i>0 && nums[i-1]>nums[i]) {
                anchor = i;
            }

            count = Math.max(count, i-anchor+1);
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_674 t = new leetcode_674();
        t.solve();
    }
}
