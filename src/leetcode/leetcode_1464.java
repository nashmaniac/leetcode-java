package leetcode;

public class leetcode_1464 {
    public int maxProduct(int[] nums) {
        int first_index = -1, second_index = -1;
        for (int i=0;i<nums.length;i++) {
            if (first_index == -1) {
                first_index = i;
                continue;
            }
            if (nums[i] >= nums[first_index]) {
                first_index = i;
            }
        }
        for (int i=0;i<nums.length;i++) {
            if (second_index == -1 && i!=first_index) {
                second_index = i;
                continue;
            }
            if (second_index != -1  && nums[i] > nums[second_index] && i!=first_index) {
                second_index = i;
            }
        }
        return (nums[first_index]-1)*(nums[second_index]-1);
    }

    public static void main(String[] args) {
        leetcode_1464 t = new leetcode_1464();
        int[][] m = new int[][] {{10,2,5,2}, {1,5,4,5}, {3,7}, {3,4,5,2}};
        for(int[] n: m) {
            System.out.println(t.maxProduct(n));
        }
    }
}
