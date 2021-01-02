package medium;

public class leetcode_55 {
    public void solve() {
    }



    public boolean canJump(int[] nums) {
        if(nums.length <= 1) {
            return true;
        }
        if(nums.length == 2) {
            return nums[0] == nums.length-1;
        }
        int index = 0;
        while (index < nums.length-1) {
            if(nums[index] == 0) {
                break;
            }
            index += nums[index];
        }
        return index == nums.length-1;
    }

    public static void main(String[] args) {
        leetcode_55 t = new leetcode_55();
        t.solve();
    }
}
