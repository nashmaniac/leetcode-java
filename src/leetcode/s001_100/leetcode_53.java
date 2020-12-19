package leetcode.s001_100;
public class leetcode_53 {

//    public int maxSubArray(int[] nums) {
//        // greedy implementation
//        int currSum = nums[0], maxSum = nums[0];
//        for(int i=1;i< nums.length;i++) {
//            currSum = Math.max(currSum+nums[i], nums[i]);
//            maxSum = Math.max(currSum, maxSum);
//        }
//        return maxSum;
//    }



    // kandane's algorithm
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        for(int i=1;i< nums.length;i++) {
            if(nums[i-1]>0) {
                nums[i]+=nums[i-1];
            }
            maxSum = Math.max(nums[i], maxSum);
        }
        return maxSum;
    }

    public int helper(int[] nums, int left, int right, int p) {
        if(left == right) {return nums[left];}

        int leftSum = Integer.MIN_VALUE;
        for(int i=p;i<left-1;i--) {
            leftSum = Math.max(leftSum, leftSum+nums[i]);
        }

        int rightSum = Integer.MIN_VALUE;
        for(int i=p+1;i<right+1;i++) {
            rightSum = Math.max(rightSum, rightSum+nums[i]);
        }

        return leftSum + rightSum;
    }

    public int sum(int[] nums, int left, int right) {
        if(left == right) {
            return nums[left];
        }

        int p = (left+right)/2;

        int leftSum = sum(nums, left, p);
        int rightSum = sum(nums, p+1, right);
        int crossSum = helper(nums, left, right, p);

        return Math.max(leftSum, Math.max(rightSum, crossSum));
    }

    // divide & conquer method
    public int maxSubArrayDivide(int[] nums) {
        return sum(nums, 0, nums.length);
    }


    public static void main(String[] args) {
        leetcode_53 t = new leetcode_53();
    }
}
