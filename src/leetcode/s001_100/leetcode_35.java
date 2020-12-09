package leetcode.s001_100;

public class leetcode_35 {

    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            if(target<nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        leetcode_35 t = new leetcode_35();
    }
}
