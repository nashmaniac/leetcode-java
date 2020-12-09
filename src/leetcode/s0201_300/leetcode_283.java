package leetcode.s0201_300;

public class leetcode_283 {

    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }

        for(int i=count;i<nums.length;i++) {
            nums[i] = 0;
        }

    }

    public static void main(String[] args) {
        leetcode_283 t = new leetcode_283();
    }
}
