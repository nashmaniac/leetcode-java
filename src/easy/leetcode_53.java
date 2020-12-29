package easy;

public class leetcode_53 {
    public void solve() {
    }

    public int crossSum(int[] nums, int start, int end, int p) {
        if(start == end) {
            return nums[start];
        }
        int leftSum = Integer.MIN_VALUE;
        int count = 0;
        for(int i=p;i>=start;i--) {
            count+=nums[i];
            leftSum = Math.max(leftSum, count);
        }

        int rightSum = Integer.MIN_VALUE;
        count = 0;
        for(int i=p+1;i<end+1;i++) {
            count += nums[i];
            rightSum = Math.max(rightSum, count);
        }
        return leftSum + rightSum;
    }

    public int helper(int[] nums, int start, int end) {
        if(start == end) {
            return nums[start];
        }
        int p = (start+end) / 2;
        int left = helper(nums, start, p-1);
        int right = helper(nums, p+1, end);
        int crossSum = crossSum(nums, start, end, p);
        return Math.max(Math.max(left, right), crossSum);
    }

    public int maxSubArray(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }

    public int maxSubArray1(int[] nums) {
        // dynamic programming
        if(nums.length == 0) {
            return 0;
        }
        int maxSum = 0;
        int currentSum = nums[0];
        for(int i=1;i<nums.length;i++) {
            currentSum = Math.max(currentSum, currentSum+nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }




    public static void main(String[] args) {
        leetcode_53 t = new leetcode_53();
        t.solve();
    }
}
