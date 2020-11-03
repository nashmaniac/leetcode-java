package leetcode.s1401_1500;

public class leetcode_1480 {

    public int[] runningSum(int[] nums) {
        for(int i=1;i< nums.length;i++) {
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        leetcode_1480 t = new leetcode_1480();
        int[] nums = new int[]{1,2,3,4};
        System.out.println(t.runningSum(nums));
    }
}
